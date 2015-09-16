package run;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import mobs.Mob;

public class Game extends JFrame implements KeyListener {

    private Mob mob;
    private Player player;

    public Game() {
        System.out.println("Spiel wird gestartet...");
    }

    public void runGame() {
        
        addKeyListener(this);
        setTitle("Bärenstarkes Wunderland of Big Doooom");
        setSize(new Dimension(720, 480));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        this.mob = new Mob();
        this.mob.generateMobs();

        this.player = new Player(this.mob);
       
        

    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        int keyCode = ke.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_SPACE:
                player.attack(mob.getBear(0), 10);
                break;
            case KeyEvent.VK_T:
                player.attack(mob.getBear(0), 1);
                break;
            case KeyEvent.VK_S:
               player.suicide();
               System.out.println("the player is now " + player.getAlive());
                break;
          
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }

}
