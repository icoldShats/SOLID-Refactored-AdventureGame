public class LevelManager {
    private int level;

    public LevelManager() {
        this.level = 1;
    }

    public int getLevel() {
        return level;
    }

    public void advanceLevel() {
        level++;
    }
}