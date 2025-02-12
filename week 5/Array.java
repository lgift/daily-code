import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        ready();
    }

    public static void ready() {

        // silly stuff :D
        Scanner input = new Scanner(System.in);
        System.out.println("Are you ready ................?????");
        input.nextLine();

        System.out.println("Muahahahahahahahaha....  :3");
        System.out.println("\n\n");
        firstTask();

        input.close();
    }

    public static void firstTask() {

        System.out.println("**TASK ONE**");

        int[] numbers;
        numbers = new int[5];

        // print out each number in array
        System.out.println("Element 1 is: " + numbers[0]);
        System.out.println("Element 2 is: " + numbers[1]);
        System.out.println("Element 3 is: " + numbers[2]);
        System.out.println("Element 4 is: " + numbers[3]);
        System.out.println("Element 5 is: " + numbers[4]);

        System.out.println("\n");
        secondTask();
        
    }

    public static void secondTask() {

        System.out.println("---");
        System.out.println("**TASK TWO**");

        int[] numbers;
        numbers = new int[5];

        numbers[0] = 21;
        numbers[1] = 12;
        numbers[2] = 22;
        numbers[3] = 11;
        numbers[4] = 2;

        // print out each number in array on same line
        for (int i : numbers) {
            System.out.print(i + " ");
        }

        System.out.println("\n");
        thirdTask();
    }

    public static void thirdTask() {

        System.out.println("---");
        System.out.println("**TASK THREE**");

        int[] numbers = new int[5];

        numbers[0] = 21;
        numbers[1] = 12;
        numbers[2] = 22;
        numbers[3] = 11;
        numbers[4] = 2;

        System.out.println("\ncomplete array:");
        // print out each number in array on same line
        for (int i : numbers) {
            System.out.print(i + " ");
        }

        System.out.println("\n");
        fourthTask();
    }

    public static void fourthTask() {

        System.out.println("---");
        System.out.println("**TASK FOUR**");

        int[] numbers = new int[5];
        int values = 0;

        // populate multiples of three in the array
        for (int i = 0; i < numbers.length; i++) {
            values += 3;
            numbers[i] = values;
        }

        System.out.println("\ncomplete array:");
        // print out each number in array on same line
        for (int i : numbers) {
            System.out.print(i + " ");
        }

        System.out.println("\n");
        fifthTask();
    }

    public static void fifthTask() {

        System.out.println("---");
        System.out.println("**TASK FIVE**");

        char[] charArray = new char[5];
        char element = 'A';

        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = ((char)element);
            element += 2;
        }

        System.out.println("\ncomplete array:");
        // print out each number in array on same line
        for (char i : charArray) {
            System.out.print(i + " ");
        }

        System.out.println("\n");
        sixthTask();

    }

    public static void sixthTask() {

        System.out.println("---");
        System.out.println("**TASK SIX**");

        // prompt user the size of array
        Scanner input = new Scanner(System.in);
        System.out.println("Hey kid... what size do you want a ... yknow... array..........");
        int size = input.nextInt();

        int randomNumber;
        int[] epicArray = new int[size];

        // add random numbers
        for (int i = 0; i < epicArray.length; i++) {
            randomNumber = (int) (Math.random() * (50-1) + 1);
            epicArray[i] = randomNumber;
        }

        System.out.println("\ncomplete array:");
        // print out each number in array on same linee
        for (int i : epicArray) {
            System.out.print(i + " ");
        }
    
        input.close();
    }
}