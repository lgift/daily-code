import java.io.*;
import java.util.*;

/**
 * Main class that manages student records.
 * This class demonstrates file I/O and exception handling in Java.
 * 
 * The StudentRecordsManager handles:
 * - Reading student data from CSV files
 * - Processing and validating the data
 * - Calculating statistics
 * - Writing formatted results to output files
 * - Proper exception handling throughout the process
 */
public class StudentRecordsManager {
    
    /**
     * Main method to run the program.
     * Handles user input and delegates processing to other methods.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        StudentRecordsManager manager = new StudentRecordsManager();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter input filename: ");
        String inputFile = scanner.nextLine();
        
        System.out.print("Enter output filename: ");
        String outputFile = scanner.nextLine();
        
        try {
            manager.processStudentRecords(inputFile, outputFile);
        } catch (Exception e) {
            System.err.println("your error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    
    /**
     * Process student records from an input file and write results to an output file.
     * This method orchestrates the entire data processing workflow.
     * 
     * @param inputFile Path to the input file containing student records
     * @param outputFile Path to the output file where results will be written
     */
    public void processStudentRecords(String inputFile, String outputFile) {
        try {
            List<Student> students = readStudentRecords(inputFile);
            writeResultsToFile(students, outputFile);
            System.out.println("SUCCESS!!!!!!!!!");
        } catch (FileNotFoundException e) {
            System.err.println("Hey we couldn't find " + inputFile + " try checking your spelling or path or STOPO BEIN 😡😡😡😡" + e.getMessage());
        } catch (IOException e) {
            System.err.println("um..."  + e.getMessage());
        }
    }
    
    /**
     * Read student records from a file and convert them to Student objects.
     * This method demonstrates file reading operations and exception handling.
     * 
     * @param filename Path to the input file
     * @return List of Student objects created from the file data
     * @throws IOException If an I/O error occurs during file reading
     */
    public List<Student> readStudentRecords(String filename) throws IOException {
        List<Student> students = new ArrayList<>();
        try(BufferedReader buff = new BufferedReader(new FileReader(filename))) {

            String line;
            while ((line = buff.readLine()) != null) {
                String[] parts = line.split(",");
                
                String studentId = parts[0];
                String name = parts[1];
                int[] grades = new int[4];

                for (int i=0; i < 4; i++) {
                    int grade = Integer.parseInt(parts[2 + i]);
                    if (grade < 0 || grade > 100) {
                        throw new InvalidGradeException("Grade out of range " + grade);
                    }
                grades[i] = grade;
                }

                Student student = new Student(studentId, name, grades);
                students.add(student);
            }
        } catch (NumberFormatException e){
            System.err.println("BAD BAD ADBBADDD ERRORR ....... stoopid STUPID STUPID STUPID THAT CANT BE PARSED TO INT" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("NOI NO NO NO NO NOT ENOGUH FIELDS NONOIONIJIOONOONINONOPNONOINONONONNONONONON" + e.getMessage());
        } catch (InvalidGradeException e) {
            System.err.println("BAD GRADE" + e.getMessage());
        }
        
        return students;
    }
    
    /**
     * Write processed student results to an output file.
     * This method demonstrates file writing operations.
     * 
     * @param students List of Student objects to be written to the file
     * @param filename Path to the output file
     * @throws IOException If an I/O error occurs during file writing
     */
    public void writeResultsToFile(List<Student> students, String filename) throws IOException {
       try(PrintWriter prw = new PrintWriter(new FileWriter(filename))) {
        prw.println("EPIC STUIF:");
        prw.println("============");

        for (Student student : students) {
            prw.println(student.toString());
        }

        int totalStudents = students.size();
        int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;
        double totalAverage = 0.0;

        for (Student student : students) {
            double average = student.getAverageGrade();
            totalAverage += average;
            
            if (average >= 90) countA++;
            else if (average >= 80) countB++;
            else if (average >= 70) countC++;
            else if (average >= 60) countD++;
            else countF++;
        }

        double classAverage = totalStudents > 0 ? totalAverage / totalStudents : 0;

        prw.println("Total number of STUJDENTNSS: " + totalStudents);
        prw.printf("Class AVERAge: %.2f\n", classAverage);
        prw.println("\nGRADE DISTRBUTON??:");
        prw.println("A: " + countA);
        prw.println("B: " + countB);
        prw.println("C: " + countC);
        prw.println("D: " + countD);
        prw.println("F: " + countF);
       } catch (Exception e) {
        System.out.println("DIE");
       }

    }
}