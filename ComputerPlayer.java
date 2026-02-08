package Game;
import java.util.Random;

public class ComputerPlayer extends Player {
    public ComputerPlayer(String c){
        super(c);
    }

    int nbr2;

    public int takePins(Board b) {
        Random rand = new Random();
        nbr2 = rand.nextInt(2) + 1;
        b.takePins(nbr2);
        return nbr2;
    }
}