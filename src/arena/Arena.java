package arena;

import java.util.Scanner;
import java.util.Random;

public class Arena {
    public static void main(String[] args) {
        Player playerA = createPlayer("A");
        Player playerB = createPlayer("B"); 
    }

    public static Player createPlayer(String playerName) {
        Scanner sc = new Scanner(System.in);

        // fetching details of the player as an input from the user 
        System.out.println("Enter details for Player " + playerName + ":");
        System.out.print("Health: ");
        int Phealth = sc.nextInt();
        System.out.print("Strength: ");
        int Pstrength = sc.nextInt();
        System.out.print("Attack: ");
        int Pattack = sc.nextInt();
        sc.close();
       
        // calling the constructor of player class with attributes & returning a player object
        return new Player(playerName, Phealth, Pstrength, Pattack);
    }
}
