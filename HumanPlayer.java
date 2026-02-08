package Game;
import javax.swing.JOptionPane;

public class HumanPlayer extends Player {
    int nbr1;

    public HumanPlayer(String p) {
        super(p);
    }

    public int takePins(Board b) {

        nbr1 = UserInterface.askForInt("Hur många stickor väljer du? ");
        if(nbr1 > 2|| nbr1 <= 0 ){
            UserInterface.printMessage("Du får bara välja 1 eller 2");
            takePins(b);
        }
        else {
            b.takePins(nbr1);
            return nbr1;
        }
        return nbr1;
    }
}