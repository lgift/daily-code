import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class megaMillions {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static double balance;
    static double totalWinnings = 0;
    static double totalSpent = 0;

    public static void main(String[] args) {
        initializeGame();
        runGame(); // run game YESS
        printGameSummary();
    }

    public static void initializeGame() {
        balance = 50.00;
        System.out.println("    WELCOME TO MEGA MILLIONS!   " + "\n================================" + "\nYou start with $50.00.");
    }

    public static void runGame() {
        System.out.println("\n================================" + "\nCurrent Balance: $" + balance + "\n================================");

        boolean gamblingActivated = true; // flag to initially like yknow get them playing yknow :3

        while (gamblingActivated) {
            if (balance < 2) {
                System.out.println("\n YOU'RE POOR!!! LOLOLOLOL!!!!");
                gamblingActivated = false;
                break;
            }

            playRound();

            if (balance < 2) {
                System.out.println("\n YOU'RE POOR!!! LOLOLOLOL!!!!");
                gamblingActivated = false;
                break;
            } else {
                System.out.println("\nYo.. um. Do you wanna play again? lmk #Gamblers4Life (yes/no): ");
                String confirmation = scanner.nextLine();
                confirmation = confirmation.toLowerCase(); // jsut in case someone tries to be silly and type in upper/mixed case

                if (confirmation.equals("no")) { // if they say no, QUIT NOW! turn off gamling mode!
                    gamblingActivated = false;
                }
            }           

        }
        
    }

    public static void playRound() {
        System.out.println("Erm.. do you want Quick Pick? (randomly selects numbers for you) (yes/no): ");
        String quickPick = scanner.nextLine();
        quickPick = quickPick.toLowerCase();
        int[] numbers;

        if (quickPick.equals("yes")) {
            numbers = generateNumbers();

            // print selected numbers
            System.out.print("Your Quick Pick: [");
            for (int i = 0; i < 5; i++) {
                System.out.print(numbers[i]);
                if (i < 4) {
                    System.out.print(", ");
                }
            }

            System.out.print("] Mega Ball: " + numbers[5]);

        } else {
            numbers = new int[6];
            
            for (int i = 0; i < 5; i++) {
                numbers[i] = getValidNumber(1);
            }

            numbers[5] = getValidNumber(0);

            // print selected numbers
            System.out.print("Your Pick: [");
            for (int i = 0; i < 5; i++) {
                System.out.print(numbers[i]);
                if (i < 4) {
                    System.out.print(", ");
                }
            }

            System.out.print("] Mega Ball: " + numbers[5]);
        }

        // markiplier
        double ticketCost = 2.00;
        int markiplierValue = 1;
        
        if (balance >= 3.00) {
            System.out.println("\nHey.. hey you... do you want to add MEGAPLIER for only $1? (yes/no): ");
            String mega = scanner.nextLine();
            mega = mega.toLowerCase();
    
            // if person confirms markiplier, adjust ticket price and megaplier value
            if (mega.equals("yes")) {
                ticketCost = 3.00;
                markiplierValue = getRandomMegaplier();
            } 
        }
    
        else {
            System.out.println("\n LOL you can't afford a megaplier OLOLOLOLO regular ticket for you LOLOLOLOL");
        }

        totalSpent = totalSpent + ticketCost;
        updateBalance(-ticketCost); // KEEP THAT BALANCE UPATED!! WOOO!! GAMBLE!!

        //WINNER ??
        int[] winningNumbers = generateNumbers();
        System.out.println("\n================================" + "\nWINNING NUMBERS:" + "\n================================");
        System.out.print("[");
        for (int i = 0; i < 5; i++) {
            System.out.print(winningNumbers[i]);
            if (i < 4) {
                System.out.print(", ");
            }
        }

        System.out.print("] Mega Ball: " + winningNumbers[5]);

        if (markiplierValue > 1){
            System.out.println("\nMegaplier Drawn: x" + markiplierValue);
        }

        // counting matches to verify
        int matchCount = countMatches(numbers, winningNumbers);
        boolean megaBallMatch = (numbers[5] == winningNumbers[5]);

        int prize = getPrize(matchCount, megaBallMatch);

        // prize multiplier
        if (markiplierValue > 1 && prize > 0 && prize < 100000000) {
            prize = prize * markiplierValue;
        }

        // printing how much player won depending on how much they earned
        if (prize == 100000000) {
            System.out.println("\nJACKPOT!! -- You won: " + prize);
        } else if (prize > 10) {
            System.out.println("\nWOW! -- You won: " + prize);
        } else {
            System.out.println("\nYou won: " + prize);
        }

        totalWinnings = totalWinnings + prize;
        updateBalance(prize);
        System.out.println("New Balance: $" + balance);

    }

    public static int[] generateNumbers() {
        int[] numbers = new int[6];

        // normal numbers :D
        for (int i = 0; i < 5; i++) {
            numbers[i] = (int)(Math.random() * 70) + 1;
        }

        // mega ball :3
        numbers[5] = (int)(Math.random() * 25) + 1;

        return numbers;
    }

    public static int getValidNumber(int prompt) {
        int numba = 0;
        boolean numbaCheck = false;
        
        if (prompt == 1) {
            // normal number fetching and validation
            
            while (numbaCheck == false) {
                System.out.println("Enter number (1 - 70): ");
                try {
                    numba = scanner.nextInt();
                    scanner.nextLine(); // buffer

                    if (70 >= numba && numba >= 1) {
                        numbaCheck = true;
                        return numba;
    
                    } else {
                        System.out.println("NO! THASTS NOT IN THE RIGHT RANGE! BETWEEN 1 AND 70 DIE DIE DIE DIE DIE TRY AGAIN\n");
                }
                    
                } catch (Exception e) {
                    System.out.println("\nThat... that wasn't a number... REDO IT AGAIN!");
                    scanner.nextLine();
                }
            }
        }
        
        else {
            // megaball number fetching and validaiton

            while (numbaCheck == false) {
                System.out.println("Enter megaball (1 - 25): ");
                try {
                    numba = scanner.nextInt();
                    scanner.nextLine(); // buffer

                    if (25 >= numba && numba >= 1) {
                        numbaCheck = true;
                        return numba;
    
                    } else {
                        System.out.println("NO! THASTS NOT IN THE RIGHT RANGE! BETWEEN 1 AND 25 DIE DIE DIE DIE DIE TRY AGAIN\n");
                    }

                } catch (Exception e) {
                    System.out.println("\nThat... that wasn't a number... REDO IT AGAIN!");
                    scanner.nextLine();
                }
            }
        }
        return numba;
    }

    public static int getRandomMegaplier() {
        int randomMarkiplier = (int)(Math.random() * 4) + 1;
        // hello everybody  my name is markiplier
        if (randomMarkiplier == 1) {
            return 2;
        } else if (randomMarkiplier == 2) {
            return 3;
        } else if (randomMarkiplier == 3) {
            return 4;
        } else  {
            return 5;
        }
    }

    public static double updateBalance(double moneys) {
        balance = balance + moneys;

        if (balance < 0) { // balance in NEGATIVE??? NO!!! ITS ZERO NOW!!
            balance = 0;
        }

        return balance;
    }

    public static int countMatches(int[] userNumbers, int[] winningNumbers) {
        int matchCount = 0;
 
        for (int i = 0; i < 5; i ++) {
            if (contains(winningNumbers, userNumbers[i])) {
                matchCount = matchCount + 1;
            }
        }

        return matchCount;
    }

    public static boolean contains(int[] array, int number) {
        for (int i : array) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }

    public static int getPrize(int matchCount, boolean megaBallMatch) {
        // Tntroducing.. The AMAZING Digital wall of else if statements!!!

        if (matchCount == 5 && megaBallMatch) {
            return 100000000;
        } else if (matchCount == 5 && !megaBallMatch) {
            return 1000000;
        } else if (matchCount == 4 && megaBallMatch) {
            return 10000;
        } else if (matchCount == 4 && !megaBallMatch) {
            return 500;
        } else if (matchCount == 3 && megaBallMatch) {
            return 200;
        } else if (matchCount == 3 && !megaBallMatch) {
            return 10;
        } else if (matchCount == 2 && megaBallMatch) {
            return 10;
        } else if (matchCount == 1 && megaBallMatch) {
            return 4;
        } else if (matchCount == 0 && megaBallMatch) {
            return 2;
        } else {
            return 0;
        }
    }

    public static void printGameSummary() {
        System.out.println("\n================================" + "\nGAME OVER" + "\n================================");
        System.out.println("Total Spent: $" + totalSpent);
        System.out.println("Total Winnings: $" + totalWinnings);
        System.out.println("Final Balance: $" + balance);
        System.out.println("\n================================");
    }
}