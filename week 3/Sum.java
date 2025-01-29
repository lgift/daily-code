import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter didigts... ENTER ENTER ENTER 🤣🐈🐈🐈🐈🐈");
        String digits = input.nextLine();

        // splits 
        String[] collection = digits.split("");

        int counter = 0;

        // iterates through the array
        for (String i : collection) {
            // converts string to int and adds it to counter
            // if error raises when adding to counter because of non parsable to int character, yell at user and continue
            try {
                counter += Integer.parseInt(i);
            } catch (Exception e) {
                System.out.print("\nLooks like you enterd a non number.. why did you type: " + i + "????\n");
            }
            
        }

        // if counter 0, scold user but otherwise just print sum
        if (counter > 0) {
            System.out.println("\nTHE SUM IS.........." + counter + "😸😸😸😸");
        } else {
            System.out.println("\nThere's NOTHING ....... how disgraceful!!!!!! 💔💔😿😿😿😿😿");
        }
        input.close();
    }
}