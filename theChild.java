package Game;

import java.util.Random;

public class theChild extends Player{
    
    public theChild(String p) {
        super(p);
    }
    
    int nbr2;
  
        
    public int takePins(Board b) {
        if (b.getNoPins() % 2 == 0){
            nbr2 = 2;
            }
        else {
            nbr2 = 1;
            }
        b.takePins(nbr2);
        return nbr2;
    }

    
}