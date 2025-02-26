import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey... I said HEY YOU! We're makin one of them ARRAYS around here .... what size u want??? hm??? hmm??TELL ME: ");
        int size = input.nextInt();

        // validate positive array size
        while (size < 0) {
            System.out.println("Hey... I said HEY YOU! We're makin one of them ARRAYS around here .... what size u want??? hm??? hmm??TELL ME: ");
            size = input.nextInt();
        }

        // creates array
        int[] superArray = new int[size];

        // fills with RANDOM RANDOM NUMBERS!
        for (int i = 0; i < superArray.length - 1; i++) {
            superArray[i] = (int)(Math.random() * 1000 + 1);
        }

        System.out.println("Whats up  man .... i need the target number that you wannt .. TELL ME!!!!!! ILL FIND IT!!!!: ");
        int target = input.nextInt();

        // Linear Search
        System.out.println("\nStarting linear search...");
        long linearStartTime = System.nanoTime();

        int linIndex = -1;

        for (int i = 0; i < superArray.length - 1; i++) {
            if (superArray[i] == target) {
                linIndex = i;
                break;
            }
        }

        long linearEndTime = System.nanoTime();

        // sorting array
        System.out.println("\nSorting the array...");
        Arrays.sort(superArray);

        // Binary Search
        System.out.println("\nStarting binary search...");
        long binaryStartTime = System.nanoTime();

        int binIndex = Arrays.binarySearch(superArray, target);
        if (binIndex <= 0) {
            binIndex = -1;
        }

        long binaryEndTime = System.nanoTime();

        System.out.println("\n**RESULTS**\n(target number: " + target + ")\n");
        System.out.println("linear search:\n     - Index of targetted number was " + linIndex + "\n     - Linear search took " + (linearEndTime - linearStartTime) + " nanoseconds.");
        System.out.println("binary  search:\n     - Index of targetted number was " + binIndex + "\n     - Binary search took " + (binaryEndTime - binaryStartTime) + " nanoseconds.");
    }
}
