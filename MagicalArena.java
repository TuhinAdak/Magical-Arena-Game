package swiggy_game;

import java.util.Scanner;

public class MagicalArena {
    //Class with main() function to run the game 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);//scanner class to read user input

        // Ask user if they want to input player attributes or use pre-provided attribute values
        System.out.println("Do you want to input player attributes? (Y/N)");
        String choice = sc.nextLine();

        Player playerA;
        Player playerB;

        if (choice.equals("Y")||choice.equals("y")) 
        {// If user is interested in entering player attributes
            // Input for Player A
            System.out.println("Enter name for Player A:");
            String nameA = sc.nextLine();
            System.out.println("Enter health for Player A:");
            int healthA = sc.nextInt();
            System.out.println("Enter strength for Player A:");
            int strengthA = sc.nextInt();
            System.out.println("Enter attack for Player A:");
            int attackA = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            // Input for Player B
            System.out.println("Enter name for Player B:");
            String nameB = sc.nextLine();
            System.out.println("Enter health for Player B:");
            int healthB = sc.nextInt();
            System.out.println("Enter strength for Player B:");
            int strengthB = sc.nextInt();
            System.out.println("Enter attack for Player B:");
            int attackB = sc.nextInt();

            // Create players
            playerA = new Player(nameA, healthA, strengthA, attackA);
            playerB = new Player(nameB, healthB, strengthB, attackB);
        } 
        else {
            // Use assumed values
        	System.out.println("Using assumed values for players.");
            playerA = new Player("Player A", 50, 5, 10);
            playerB = new Player("Player B", 100, 10, 5);
            
        }
    
        // Start the game
        Game game = new Game(playerA, playerB);
        game.start();
        sc.close();
    }
}
       
