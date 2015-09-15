package test;

import java.util.ArrayList;
import java.util.List;

public class Player implements IntMob {

    List<Item> items = new ArrayList<Item>();

    private int leben = 500;
    private int angriff = 50;
    private String name = "Player";
    private int level = 1;
    private int xp = 0;

    public Player() {
    }

    public void showInventory() {
        for (Item item : items) {
            System.out.println(item.getName() + " macht " + item.getDamage() + " Schaden.");
        }
    }

    public void setStartItems() {
      //  items.add(new Item("Hand", "C:/hand.png", true, 10, -1, true));
    }

   @Override
    public int getLiveNachDamage(int leben, int schaden) {
        leben -= schaden;
        return leben;
    }

    @Override
    public int getDamage(int angriff, int angriffsModifier) { 
       int schaden = angriff * angriffsModifier;
       return schaden;
    }

}
