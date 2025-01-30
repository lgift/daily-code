import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("EMNTER INTEGER NOW!!!! 😸😸😸😸😿😾😹");
        int factorial = input.nextInt();

        // to count down to multiply by the multiply
        int countdown = factorial;
        long multiply = 1;

        math(factorial, countdown, multiply);

        input.close();

    }

    static void math(int factorial, int countdown, long multiply) {
        // multiply the counting down value from the factorial and multiply it to the final result
        while (countdown > 0) {
            multiply *= countdown;
            countdown -= 1;
        }

        System.out.println("\n😸😸😸😸😸😸😸😸😸\n");
        System.out.println("The factorial of " + factorial + " is " + multiply + "\n");
        
    }

}
