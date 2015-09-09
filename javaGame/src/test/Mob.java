package test;

import java.util.ArrayList;
import java.util.List;

public class Mob {

    List<Pacman> mobs = new ArrayList<>();

    public Mob() {
        
        Pacman36.getDamage();
        
        
        generateDefaultMob();
    }

    public void generateDefaultMob() {

        int random = (int) Math.round(Math.random() * 5 + 5);
        for (int i = 0; i < random; i++) {
                mobs.add(new Pacman());
            System.out.println("DefaultMob nummer " + (i) + " wird erstellt." );
            
        }

    }
}
