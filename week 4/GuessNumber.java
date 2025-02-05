import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int random = (int)(Math.random() * 101);

        // create scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Hey you ..... guess the MAAAAGIC NUMBER between 0 and  a HUNDRED or DIE DIE DIE DIE DIE DIE DIE: ");
        int answer = input.nextInt();
        String buffer = input.nextLine();

        // while the answer is not the guessed number, continue to reprompt because theyer WRONG
        while (answer != random) {
            if (answer > random) {
                System.out.println("YOur guess is too  HIGH!!! stop being so PRETENTIOUS AND high and MIGHTY !!A!!!! AHHH!!!\n");
            } else if (answer < random) {
                System.out.println("YOur guess is too  LOW!!! stop being so WEAK AND BORING!!!!! !!A!!!! AHHH!!!\n");
            }

            System.out.println("Hey you ..... guess the MAAAAGIC NUMBER between 0 and  a HUNDRED or DIE DIE DIE DIE DIE DIE DIE: ");
            answer = input.nextInt();
            buffer = input.nextLine();
        }

        System.out.println("YES!!! YOU GUESS THE NUMBER " + random + " CORRECTLY YAAAAAY!!!!!!!!!!");

        // NO MEMORY LEAKS!!!!!!!
        input.close();
    }
}
