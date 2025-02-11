import java.util.Scanner;

public class AllInOne {
    public static void processNumbers(int num1, int num2, int num3) {
    print(num1, num2, num3);
    }

    public static void getUserInput() {
        System.out.println("Hey you....  enter some numbers... i'll do silly stuff with. separate with spaces");
        Scanner input = new Scanner(System.in);
        
        // 1
        System.out.println("ENTER NUMBER ONE.. NOQW!");
        while (!input.hasNextInt()) {
            System.out.println("Who ❓❓❓... who do you THINK you ARE????? This is NOT A NUMBER!!!!!!!!! 🤬🤬");
            System.out.println("ENTER NUMBER ONE.. NOQW!");
            input.next();
        }
        int num1 = input.nextInt();

        // 2
        System.out.println("ENTER NUMBER TWO.. NOQW!");
        while (!input.hasNextInt()) {
            System.out.println("Who ❓❓❓... who do you THINK you ARE????? This is NOT A NUMBER!!!!!!!!! 🤬🤬");
            System.out.println("ENTER NUMBER TWO.. NOQW!");
            input.next();
        }
        int num2 = input.nextInt();

        // 3
        System.out.println("ENTER NUMBER THREE.. NOQW!");
        while (!input.hasNextInt()) {
            System.out.println("Who ❓❓❓... who do you THINK you ARE????? This is NOT A NUMBER!!!!!!!!! 🤬🤬");
            System.out.println("ENTER NUMBER THREE.. NOQW!");
            input.next();
        }
        int num3 = input.nextInt();

        processNumbers(num1, num2, num3);
        input.close();

    }

    public static int getSum(int num1, int num2, int num3) {
        // Calculate sum
        int sum = num1 + num2 + num3;
        return sum;
    }

    public static int getMax(int num1, int num2, int num3) {
        // Find max
        int max = num1;
        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        return max;
    }

    public static int getMin(int num1, int num2, int num3) {
        // Find min
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }

        return min;
    }

    public static double getAverage(int num1, int num2, int num3) {
        // Calculate average
        int sum = getSum(num1, num2, num3);
        double average = sum / 3.0;
        return average;
    }

    public static boolean getPositive(int num1, int num2, int num3) {
        // Check if all numbers are positive
        boolean allPositive = (num1 > 0 && num2 > 0 && num3 > 0);
        return allPositive;
    }

    public static void print(int num1, int num2, int num3) {
        int sum = getSum(num1, num2, num3);
        int max = getMax(num1, num2, num3);
        int min = getMin(num1, num2, num3);
        double average = getAverage(num1, num2, num3);
        boolean allPositive = getPositive(num1, num2, num3);

        System.out.println("\n**RESULTS!!!!**\n");
        System.out.println("SUM: " + sum);
        System.out.println("-----");
        System.out.println("MAX: " + max);  
        System.out.println("-----");
        System.out.println("MIN: " + min);
        System.out.println("-----");
        System.out.println("AVERAGE: " + average);
        System.out.println("-----");
        System.out.println("IT'S " + allPositive + " INFORMATION THAT ALL NUMBERS ARE POSITIVE");
        System.out.println("-----");
        System.out.println("FORMATTED OUTPUT: The sum of " + num1 + ", " + num2 + ", and " + num3 + " is " + sum + ".");
    }
 
 
    public static void main(String[] args) { 
        getUserInput();
    }
}
