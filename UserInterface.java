package Game;

import javax.swing.JOptionPane;

public class UserInterface {

    /** Visar en dialogruta med texten msg. */
    public static void printMessage(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
    /**
    * Visar en dialogruta med texten msg och och läser in ett positivt heltal. Om
    * användaren skriver något som inte kan tolkas som ett positivt heltal ska -1
    * returneras. Om användaren klickar på "Avbryt" ska -2 returneras.
    */
    
    public static int askForInt(String msg) {
        String input_String = JOptionPane.showInputDialog(null, msg);
            
        if ( input_String == null){
            printMessage("Hejdå :(");
            System.exit(0);
            return -2;
            }

        try{
            int n = Integer.parseInt(input_String);
            if(n > 0){
                return n;
            }
            else {
                return -1;
            }

        }
        catch (NumberFormatException e) {
                printMessage("Felaktig indata. Försök igen");
                return -1;
            }    

        }
        

        
    }
