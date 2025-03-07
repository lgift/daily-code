import java.util.Random;
import java.util.Scanner;

public class MegaMillions {
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

    // initalizes balances and prints welcome message

    public static void initializeGame() {
        balance = 50.00;
        System.out.println("    WELCOME TO MEGA MILLIONS!   " + "\n================================" + "\nYou start with $50.00.");
    }

    // runs the game epic sauce

    public static void runGame() {
        System.out.print("\n--------------------------------" + "\nCurrent Balance: $");
        System.out.printf("%.2f", balance);
        System.out.print("\n--------------------------------\n");
        boolean gamblingActivated = true; // flag to initially like yknow get them playing yknow :3

        while (gamblingActivated) {
            if (balance < 2) {
                System.out.println("\n Uh... you're all out of money. GET OUT OF MY CASINO! NO POOR PEOPLE!!");
                gamblingActivated = false;
                break;
            }

            playRound();

            if (balance < 2) {
                System.out.println("\n Uh... you're all out of money. GET OUT OF MY CASINO! NO POOR PEOPLE!!");
                gamblingActivated = false;
                break;
            } else {
                System.out.print("\nDo you want to play again? (yes/no): ");
                String confirmation = scanner.nextLine();
                confirmation = confirmation.toLowerCase(); // jsut in case someone tries to be silly and type in upper/mixed case

                // validation to prevent any other non yes/no answers
                while (!confirmation.equals("yes") && !confirmation.equals("no")) {
                    System.out.println("What?");
                    System.out.print("Do you want to play again? (yes/no): ");
                    confirmation = scanner.nextLine();
                    confirmation = confirmation.toLowerCase();
                }

                if (confirmation.equals("no")) { // if they say no, QUIT NOW! turn off gamling mode!
                    gamblingActivated = false;
                } else {
                    System.out.print("\n--------------------------------" + "\nCurrent Balance: $");
                    System.out.printf("%.2f", balance);
                    System.out.print("\n--------------------------------\n");
                }
            }           

        }
        
    }

    public static void playRound() {
        System.out.print("Do you want Quick Pick? (yes/no): ");
        String quickPick = scanner.nextLine();
        quickPick = quickPick.toLowerCase();
        int[] numbers;

        // validation to prevent any other non yes/no answers
        while (!quickPick.equals("yes") && !quickPick.equals("no")) {
            System.out.println("What?");
            System.out.print("Do you want Quick Pick? (yes/no): ");
            quickPick = scanner.nextLine();
            quickPick = quickPick.toLowerCase();
        }

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
                int epicNum = 0;

                epicNum = getValidNumber(1);

                // validation to prevent any other non yes/no answers
                while (contains(numbers, epicNum)) {
                    System.out.println("You already selected that number.");
                    epicNum = getValidNumber(1);
                }

                numbers[i] = epicNum;
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
            System.out.print("\nDo you want to add Megaplier for $1 (yes/no): ");
            String mega = scanner.nextLine();
            mega = mega.toLowerCase();

            // validation to prevent any other non yes/no answers
            while (!mega.equals("yes") && !mega.equals("no")) {
                System.out.println("What?");
                System.out.print("Do you want to add Megaplier for $1 (yes/no): ");
                mega = scanner.nextLine();
                mega = mega.toLowerCase();
            }
    
            // if person confirms markiplier, adjust ticket price and megaplier value
            if (mega.equals("yes")) {
                ticketCost = 3.00;
                markiplierValue = getRandomMegaplier();
            } 
        }
    
        else {
            System.out.println("\n\n You CANNOT afford a markiplier ticket. You WILL get a normal ticket.");
        }

        totalSpent = totalSpent + ticketCost;
        updateBalance(-ticketCost); // KEEP THAT BALANCE UPATED!! WOOO!! GAMBLE!!

        //WINNER ??
        int[] winningNumbers = generateNumbers();
        System.out.println("\n================================" + "\n       WINNING NUMBERS:" + "\n================================");
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
            System.out.println("================================");
        } else {
            System.out.print("\n================================");
        }
        

        // counting matches to verify
        int matchCount = countMatches(numbers, winningNumbers);
        boolean megaBallMatch = (numbers[5] == winningNumbers[5]);

        int prize = getPrize(matchCount, megaBallMatch);

        // prize multiplier
        if (markiplierValue > 1 && prize > 0 && prize < 100000000) {
            prize = prize * markiplierValue;
        }

        System.out.println("\nYou Won: $" + prize);

        totalWinnings = totalWinnings + prize;
        updateBalance(prize);
        System.out.print("New Balance: $");
        System.out.printf("%.2f", balance);
        System.out.println("");

    }

    // randomly generates numbers for quick pick option
    
    public static int[] generateNumbers() {
        int[] numbers = new int[6];
        int epicNum = 0;
        
        // normal numbers :D
        for (int i = 0; i < 5; i++) {
            epicNum = (int)(Math.random() * 70) + 1;
            while (contains(numbers, epicNum)) {
                epicNum = (int)(Math.random() * 70) + 1;
            }
            
            numbers[i] = epicNum;
        }

        // mega ball :3
        numbers[5] = (int)(Math.random() * 25) + 1;

        return numbers;
    }

    // manual number submissions from user

    public static int getValidNumber(int prompt) {
        int numba = 0;
        boolean numbaCheck = false;
        
        if (prompt == 1) {
            // normal number fetching and range validation
            
            while (numbaCheck == false) {
                System.out.print("Enter number (1 - 70): ");
                try {
                    numba = scanner.nextInt();
                    scanner.nextLine(); // buffer

                    if (70 >= numba && numba >= 1) {
                        numbaCheck = true;
                        return numba;
    
                    } else {
                        System.out.println("NO! THASTS NOT IN THE RIGHT RANGE! BETWEEN 1 AND 70 DIE DIE DIE DIE DIE TRY AGAIN");
                }
                    
                } catch (Exception e) {
                    System.out.println("That... that wasn't a number... REDO IT AGAIN!");
                    scanner.nextLine();
                }
            }
        }
        
        else {
            // megaball number fetching and range validation

            while (numbaCheck == false) {
                System.out.print("Enter megaball (1 - 25): ");
                try {
                    numba = scanner.nextInt();
                    scanner.nextLine(); // buffer

                    if (25 >= numba && numba >= 1) {
                        numbaCheck = true;
                        return numba;
    
                    } else {
                        System.out.println("NO! THASTS NOT IN THE RIGHT RANGE! BETWEEN 1 AND 25 DIE DIE DIE DIE DIE TRY AGAIN");
                    }

                } catch (Exception e) {
                    System.out.println("\nThat... that wasn't a number... REDO IT AGAIN!");
                    scanner.nextLine();
                }
            }
        }
        return numba;
    }

    // randomly generates megaplier number. hello everybody my name is welcome

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

    // updates player balanced based on ticket costs + winnings

    public static double updateBalance(double moneys) {
        balance = balance + moneys;

        if (balance < 0) { // balance in NEGATIVE??? NO!!! ITS ZERO NOW!!
            balance = 0;
        }

        return balance;
    }

    // counts the number of matches with player numbers and the winning numbers

    public static int countMatches(int[] userNumbers, int[] winningNumbers) {
        int matchCount = 0;
 
        for (int i = 0; i < 5; i ++) {
            if (contains(winningNumbers, userNumbers[i])) {
                matchCount = matchCount + 1;
            }
        }

        return matchCount;
    }

    // checks if element is in array

    public static boolean contains(int[] array, int number) {
        for (int i : array) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }

    // determines player winnings based on how many matches they have

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

    // prints final stats of the game
    public static void printGameSummary() {
        System.out.println("\n================================" + "\n           GAME OVER" + "\n================================");
        System.out.print("Total Spent: $");
        System.out.printf("%.2f", totalSpent);
        System.out.print("\nTotal Winnings: $");
        System.out.printf("%.2f", totalWinnings);
        System.out.print("\nFinal Balance: $");
        System.out.printf("%.2f", balance);
        System.out.println("\n================================");
    }
}