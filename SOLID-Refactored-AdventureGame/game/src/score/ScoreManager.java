public class ScoreManager {
    private int score;

    public ScoreManager() {
        this.score = 0;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int points) {
        score += points;
    }
}