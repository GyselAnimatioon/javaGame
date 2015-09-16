package mobs;

import java.util.ArrayList;
import java.util.List;

public class Mob {

    List<Pacman> mobs = new ArrayList<>();
    List<Bear> bears = new ArrayList<>();

    public Mob() {
        
    }

    public void generateMobs() {
        int random = (int) Math.round(Math.random() * 5 + 5);
//        for (int i = 0; i < random; i++) {
//            mobs.add(new Pacman());
//            System.out.println("Pacman nummer " + (i) + " wird erstellt.");
//        }
//        random = (int) Math.round(Math.random() * 5 + 5);
        for (int i = 0; i < random; i++) {
            bears.add(new Bear("Bear_" + i));
            System.out.println("Bär nummer " + (i) + " wird erstellt.");
        }
    }
    
    public Bear getBear(int i) {
        return bears.get(i);
    }
}
