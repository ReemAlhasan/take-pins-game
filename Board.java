package Game;

public class Board {
    private int noPins; 

    public Board() {
        noPins = 20;
    }

    public void setUp(int a) {

    }
    
    public void takePins(int n) {
        if (noPins >= n) {
            noPins = noPins - n;
        }
        else {
            System.out.println("Antal stickor är: " + noPins + ". Försök igen.");
        }
    }

    public int getNoPins() {
        return noPins;
    }
}