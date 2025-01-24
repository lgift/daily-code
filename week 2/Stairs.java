import java.util.Scanner;

public class Stairs
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // first input :3
        System.out.println("ENTER A CHARACTER NOW.....");
        String ch = input.nextLine();
        
        // second input :3
        System.out.println("HOW MANY STEPS??");
        int numb = input.nextInt();
        
        // If anybody... and I mean ANYBODY even DARES to try and put a longer input... i will FIND them and HUNT THEM DOWN THEY WILL SUFFOCATE IN THEIR MISTAKES this just split string in case string longer than 1 :3 :3 :3 :3 :3
        String[] chacha = ch.split("");
        String character = chacha[0];
        
        
        
        // counters
        int counter = numb;
        int counter1 = 0;
        
        // stair loop
        for (int i = 0; i <= numb; i++) {
            System.out.println(((" ").repeat(counter)) + (character.repeat(counter1)));
            counter -= 1;
            counter1 += 1;
        };
    }
}