import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {

        // create scanner object
        Scanner input = new Scanner(System.in);

        // generates random numbers
        int random1 = (int)(Math.random() * 10); 
        int random2 = (int)(Math.random() * 10);
        int sum = random1 + random2;
        
        System.out.println("HEY!!! HEY YOU!! GUESS HWAT!!! DO OYOU KNOW WHJAT " + random1 + "+" + random2 + " is???: ");
        int answer = input.nextInt();
        String buffer = input.nextLine();
        
        // while the answer is not equal to the sum of random1 and random2 continue to ask and prompt user to keep trying
        while (answer != sum) {
            System.out.println("NO! YOU'RE WRONG!!! CAN YOU EVEN COUNT!!!!!!!! CAN YOU!?!?????? WRONG WRONG WORNGIM CRYINGW AAHHh\n");
            System.out.println("HEY!!! HEY YOU!! GUESS HWAT!!! DO OYOU KNOW WHJAT" + random1 + "+" + random2 + "is???: ");
            answer = input.nextInt();
            buffer = input.nextLine();
        }

        System.out.println("\nYAAAYYY YOU DID IT YOU DID IT YOU DID IT YES YES YES YES YES YYOU CAN COUNT YES YES YES");

        // NO MEMORY LEAKS!!!!!!!
        input.close();
        
    }
}
