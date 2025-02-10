import player.Player;
import combat.CombatManager;
import enemies.*;
import items.ItemManager;
import level.LevelManager;
import score.ScoreManager;

public class MainGame {
    public static void main(String[] args) {
        Player player = new Player();
        CombatManager combatManager = new CombatManager();
        ItemManager itemManager = new ItemManager();
        LevelManager levelManager = new LevelManager();
        ScoreManager scoreManager = new ScoreManager();

        Enemy skeleton = new Skeleton();
        Enemy zombie = new Zombie();
        Enemy vampire = new Vampire();

        itemManager.addItem("Gold Coin");
        itemManager.addItem("Health Elixir");

        combatManager.fight(skeleton.getName(), player);
        combatManager.fight(zombie.getName(), player);
        combatManager.fight(vampire.getName(), player);

        levelManager.advanceLevel();

        System.out.println("Game Over! " + player.getName() + " reached level " + levelManager.getLevel() + " with " + player.getExperience() + " XP.");
    }
}