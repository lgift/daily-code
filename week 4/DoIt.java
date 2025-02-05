import java.util.Scanner;

public class DoIt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey ... hey you... enter positive NUMBER!! i dare you .... I DARE YOU I DARE YOU I DARE YOU DO IT NOW NOW NOW NOW NOW: ");
        int numbers = input.nextInt();
        String buffer = input.nextLine();
        
        // while the person doesnt enter a positive number continue to reprompts causue theyre wrong
        while (numbers <= 0) {
            // if someone try to enter a zero because theyre a silly goose then they will suffer the wrath of all my angered fury
            if (numbers == 0) {
                System.out.println("\nOh... so you think your funny huh?? Tryign to put zero in here? ZERO ISN'T POSITIVE! READ HERE: https://www.bbc.co.uk/bitesize/articles/zbpbbqt#zb7h6g8. TRY AGAIN!!!!!\n");
                System.out.println("Hey ... hey you... enter positive NUMBER!! i dare you .... I DARE YOU I DARE YOU I DARE YOU DO IT NOW NOW NOW NOW NOW: \n");
                numbers = input.nextInt();
                buffer = input.nextLine();
            } else {
                System.out.println("\nWrong ...... TRY AGAIN! \n");
                System.out.println("Hey ... hey you... enter positive NUMBER!! i dare you .... I DARE YOU I DARE YOU I DARE YOU DO IT NOW NOW NOW NOW NOW: ");
                numbers = input.nextInt();
                buffer = input.nextLine();
            }
   
        }

        System.out.println("GOod JOB!!! YOU ENTERED " + numbers);

        // NO MEMORY LEAKS!!!!!!!
        input.close();

    }
}