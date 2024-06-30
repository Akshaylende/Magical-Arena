package arena;

public class Player {
    public String name;
    private int health;
    private int strength;
    private int attack;

    // Constructor for creating new player in the game with the name, health,
    // strength & attack initialization
    public Player(String Pname, int Phealth, int Pstrength, int Pattack) {
        this.name = Pname;
        this.health = Phealth;
        this.strength = Pstrength;
        this.attack = Pattack;
    }

    // Additional methods to extract player attributes information
    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getAttack() {
        return this.attack;
    }

    // Implementing damage taking ability of a player by reducing damage from health
    public void getDamage(int damage) {
        this.health = this.health > damage ? this.health - damage : 0;
    }
}
