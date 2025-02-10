import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int health;
    private int experience;
    private List<String> inventory;

    public Player() {
        this.name = "Adventurer";
        this.health = 100;
        this.experience = 0;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void decreaseHealth(int amount) {
        health -= amount;
    }

    public void increaseHealth(int amount) {
        health += amount;
    }

    public int getExperience() {
        return experience;
    }

    public void addExperience(int amount) {
        experience += amount;
    }

    public void addItem(String item) {
        inventory.add(item);
    }

    public List<String> getInventory() {
        return inventory;
    }
}
