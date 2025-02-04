// Import necessary classes
import java.util.Scanner;

public class JavaQuickMaths {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1
        System.out.print("** EXERCISE ONE: ** \n\n"); // header
        System.out.print("LOOPING FROM 1.0 to 5.0 CAUSE IM EPIC LIKE THAT !!!!!!!! \n");
        System.out.print("\n!!! RESULT !!!\n"); // header
        for (double i = 0; i <= 5.0; i++) { // counts from values 1.0 to 5.0
            System.out.print("Number: " + i);
            System.out.print(" Ceil: " + Math.ceil(i)); // finds ceiling value
            System.out.print(" Floor: " + Math.floor(i)); // finds floor value
            System.out.print(" Rint: " + Math.rint(i)); // rounds to closest integer as a double
            System.out.print(" Round: " + Math.round(i)); // rounds to closest integer
            System.out.print('\n');
            
        }
        System.out.print('\n');
        System.out.print("--------------------------------");
        System.out.print("\n\n");
        

        // 2
        System.out.print("** EXERCISE TWO: ** \n\n"); // header
        System.out.print("Enter decimal ... just becaus e... i might round it... meow: ");
        double dec = input.nextDouble(); // takes input as double

        // prints result of ceiling, floor, double rounded int, and rounded int from the decimal input
        System.out.print("\n!!! RESULT !!!\n"); // header
        System.out.println("Ceil: " + Math.ceil(dec) + " Floor: " + Math.floor(dec) + " Rint: " + Math.rint(dec) + " Round: " + Math.round(dec));

        System.out.print('\n');
        System.out.print("--------------------------------");
        System.out.print("\n\n");

        // 3
        System.out.print("** EXERCISE THREE: ** \n\n"); // header

        System.out.print("Enter integer ... just because  i might print ... ...... ");
        int intyger = input.nextInt(); // takes integer as input
        String buffer = input.nextLine(); // buffer to flush out enter key

        System.out.print("Enter string ... just because i might print ... ...... ");
        String stryng = input.nextLine(); // takes string as input

        System.out.print("\n!!! RESULT !!!\n"); // header
        System.out.println("YOU ENTER INTEGER >....... : " + intyger + "\nYoou ENTER. .STRING .... : " + stryng); // prints integer and string values
        
        System.out.print('\n');
        System.out.print("--------------------------------");
        System.out.print("\n\n");


        // 4
        System.out.print("** EXERCISE FOUR: ** \n\n"); // header
        double doyble = intyger; // implicit casting to double
        int inty = (int)dec; // explicit casting to integer :OOO
        char ch = (char) intyger; // casting integer value to its ascii value
        System.out.print("\n!!! RESULT !!!\n"); // header
        System.out.println("IMPLICIT IMPLCIIT CAST YEAHHHH YAYAYY!!!! (int -> double): " + doyble + "\nEPLIICITT CAST WHAAT (double -> int): " + inty + "\nCHAR CAST YAAAAAY (ascii): " + ch);
        
        System.out.print('\n');
        System.out.print("--------------------------------");
        System.out.print("\n\n");

        // 5
        System.out.print("** EXERCISE FIVE: ** \n\n"); // header
        System.out.print("Enter character  ... just because i might make it INT!!!!! MUAHHAHAHAHAHA ... ...... ");
        char charry = input.next().charAt(0);

        int intyint = (int)charry;
        System.out.print("\n!!! RESULT !!!\n"); // header
        System.out.println("u wanan know ascii /?/ value of " + charry + "??? wel .. lemme tell u ... its " + intyint);

        System.out.print('\n');
        System.out.print("--------------------------------");
        System.out.print("\n\n");

        // 6
        System.out.print("** EXERCISE SIX: ** \n\n"); // header
        String epic = "meow";
        String s1 = epic;
        String s2 = epic;
        String s3 = new String("meow");

        System.out.print("\n!!! RESULT !!!\n"); // header
        System.out.println("STIRNG OCMPARISON??? YOU WANNAN KNOW??\n");
        System.out.println("string 1 == string 2..... " + (s1 == s2));
        System.out.println("string 1 == string 3..... " + (s1 == s3));
        System.out.println("does string 1 truly equal string 3?? (s1.equals(s3))..... " + (s1.equals(s3)));

        System.out.print('\n');
        System.out.print("--------------------------------");
        System.out.print("\n\n");

        input.close();
    }
}