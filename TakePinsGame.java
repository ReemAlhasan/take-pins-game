package Game;
import javax.swing.JOptionPane;

public class TakePinsGame extends Board {
    public static void main(String[] args) {
        Board b = new Board();
        String enterUrNameDialog = JOptionPane.showInputDialog(null, "Skriv ditt namn : ");
        Player p = new HumanPlayer(enterUrNameDialog);
        Player c = new theChild("Datorn");
        int antalValdaPinsComputer;

        do {
            int antalValdaPinsHuman = p.takePins(b);
            UserInterface.printMessage(p.getuserId() + " har valt " + antalValdaPinsHuman + " . Antal stickor kvar " + b.getNoPins());
            // JOptionPane.showMessageDialog(null, p.getuserId() + " har valt " + antalValdaPinsHuman + " . Antal stickor kvar " + b.getNoPins());
            if (antalValdaPinsHuman > b.getNoPins()) {
                // JOptionPane.showMessageDialog(null, p.getuserId() + " van !!");
                UserInterface.printMessage(p.getuserId() + " van !!");
                break;
            }
            antalValdaPinsComputer = c.takePins(b);
            // JOptionPane.showMessageDialog(null, c.getuserId() + " har valt " + antalValdaPinsComputer + " . Antal stickor kvar " + b.getNoPins());
            UserInterface.printMessage(c.getuserId() + " har valt " + antalValdaPinsComputer + " . Antal stickor kvar " + b.getNoPins());

            if (antalValdaPinsComputer > b.getNoPins()) {
                // JOptionPane.showMessageDialog(null, c.getuserId() + " van !!");
                UserInterface.printMessage(c.getuserId() + " van !!");
                break;
            }
        }
        while (b.getNoPins() > 0);

    }
}
