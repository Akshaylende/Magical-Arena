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

        // starts playing our game untill any player's health reaches zero
        while (playerA.getHealth() > 0 && playerB.getHealth() > 0) {
            playTurn(playerA, playerB);
            if (playerB.getHealth() <= 0) {
                System.out.println("Player A wins!");
                break;
            }
            playTurn(playerB, playerA);
            if (playerA.getHealth() <= 0) {
                System.out.println("Player B wins!");
                break;
            }
        }
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

    public static void playTurn(Player Attacker, Player Defender) {
        int attackRoll = rollDice();
        int defendRoll = rollDice();

        // Calculating Attacker damage and Defenders strength as per rules
        int attackDamage = Attacker.getAttack() * attackRoll;
        int defenseStrength = Defender.getStrength() * defendRoll;

        // damage taken by attacker
        int damage = Math.max(0, attackDamage - defenseStrength);
        Defender.getDamage(damage);

        // Logging information for user for each turn
        System.out.println(Attacker.getName() + " attacks with roll " + attackRoll +
                ", " + Defender.getName() + " defends with roll " + defendRoll +
                ". Damage: " + damage + ". " + Defender.getName() + "'s health: " + Defender.getHealth());
    }

    // This method implements dice functionality in our game
    public static int rollDice() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
}
