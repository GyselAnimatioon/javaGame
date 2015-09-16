package run;

import items.Item;
import java.util.ArrayList;
import java.util.List;
import mobs.Bear;
import mobs.Mob;

public class Player {

    List<Item> items = new ArrayList<Item>();

    private Mob mob;

    private int health = 500;
    private int attack = 50;
    private String name = "Player";
    private int level = 1;
    private int xp = 0;
    private boolean alive = true;

    public Player(Mob mob) {
        this.mob = mob;

    }

    public void showInventory() {
        for (Item item : items) {
            System.out.println(item.getName() + " macht " + item.getDamage() + " Schaden.");
        }
    }

    public void attack(Bear bear, int damage) {
        bear.getLiveAfterDamage(damage);
    }
    public void suicide(){
        alive = false;
    }
    public boolean getAlive(){
        return alive;
    }

}
