package arena;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArenaTest {

    @Test
    public void testPlayerCreation() {
        Player player = new Player("TestPlayer", 100, 10, 5);
        assertEquals("TestPlayer", player.getName());
        assertEquals(100, player.getHealth());
        assertEquals(10, player.getStrength());
        assertEquals(5, player.getAttack());
    }

    @Test
    public void testPlayerDamage() {
        Player player = new Player("TestPlayer", 100, 10, 5);
        player.getDamage(20);
        assertEquals(80, player.getHealth());

        player.getDamage(90);
        assertEquals(0, player.getHealth());
    }

    @Test
    public void testAttackDamageCalculation() {
        Player attacker = new Player("Attacker", 100, 10, 10);
        Player defender = new Player("Defender", 100, 10, 5);

        int attackRoll = 5;
        int defendRoll = 2;

        int attackDamage = attacker.getAttack() * attackRoll; // 10 * 5 = 50
        int defenseStrength = defender.getStrength() * defendRoll; // 10 * 2 = 20

        int expectedDamage = Math.max(0, attackDamage - defenseStrength); // 50 - 20 = 30

        defender.getDamage(expectedDamage);
        assertEquals(70, defender.getHealth()); // 100 - 30 = 70
    }
}
