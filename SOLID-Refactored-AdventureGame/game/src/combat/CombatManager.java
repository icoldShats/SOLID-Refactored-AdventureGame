public class CombatManager {
    public void fight(String enemy, player.Player player) {
        System.out.println(player.getName() + " engages in combat with " + enemy + "!");
        if (enemy.equals("Skeleton")) {
            player.decreaseHealth(10);
            player.addExperience(20);
        } else if (enemy.equals("Zombie")) {
            player.decreaseHealth(15);
            player.addExperience(30);
        } else if (enemy.equals("Vampire")) {
            player.decreaseHealth(25);
            player.addExperience(50);
        }
    }
}