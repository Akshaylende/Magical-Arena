package arena;

import java.util.Scanner;
import java.util.Random;

public class Arena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // creating player objects for game
        Player playerA = createPlayer("A", sc);
        Player playerB = createPlayer("B", sc);

        sc.close();

        System.out.println(playerA.getName() + " " + playerA.getHealth() + " " + playerA.getStrength() + " "
                + playerA.getAttack());
        System.out.println(playerB.getName() + " " + playerB.getHealth() + " " + playerB.getStrength() + " "
                + playerB.getAttack());
    }

    public static Player createPlayer(String playerName, Scanner sc) {
        // fetching details of the player as an input from the user
        System.out.println("Enter details for Player " + playerName + ":");
        System.out.print("Health: ");
        int Phealth = sc.nextInt();
        System.out.print("Strength: ");
        int Pstrength = sc.nextInt();
        System.out.print("Attack: ");
        int Pattack = sc.nextInt();

        // calling the constructor of player class with attributes & returning a player
        // object
        return new Player(playerName, Phealth, Pstrength, Pattack);
    }
}
