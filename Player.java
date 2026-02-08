package Game;
abstract public class Player extends Board {
    private String userId;

    public Player(String userId) {
        this.userId = userId;
    }

    public String getuserId() {
        return userId;
    }

    public abstract int takePins(Board b);
}
