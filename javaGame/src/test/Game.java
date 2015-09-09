package test;

import java.util.ArrayList;
import java.util.List;

public class Game {

    
//    List<Zombie> zombies = new ArrayList<>();
//    List<Bear> bears = new ArrayList<>();
//    List<Item> allItems = new ArrayList<>();
//    List<Panda> Pandas = new ArrayList<>();
    private Player player = new Player();
    
    public Game() {
        System.out.println("Spiel wird gestartet...");
    }
    
    public void runGame() {
          Mob mob = new Mob();
//        this.createStartZombies();
//        this.showAllZombies();
//        this.createStartBears();
//        this.showAllBears();
//        this.createStartPanda();
//        this.showAllPandas();
        player.setStartItems();
    }
    
    
//    public void showAllZombies() {
//        for (Zombie zombie : zombies) {
//            System.out.println(zombie.getName() + " hat " + zombie.getLeben() + " Leben.");
//        }
//    }
//
//    public void showAllBears() {
//        for (Bear bear : bears) {
//            System.out.println(bear.getName() + " hat " + bear.getLeben() + " Leben.");
//        }
//    }
//    public void showAllPandas() {
//        for (Panda Panda : Pandas) {
//            System.out.println(Panda.getName() + " hat " + "[" + Panda.getLeben() + " Live] " + "[" + Panda.getCuteness() + " Cuteness] " + "[" + Panda.getAngrif() + " Atk]");
//        }
//    }
// 
//    
//    public void createStartZombies() {
//        
//        Zombie peter = new Zombie("Peter");
//        peter.setLeben(200);
//        zombies.add(peter);
//        zombies.add(new Zombie("Tom"));
//        zombies.add(new Zombie("Hans"));
//        zombies.add(new Zombie("Willson"));
//        zombies.add(new Zombie("Chris"));
//        zombies.add(new Zombie("Fabian"));
//        zombies.add(new Zombie("Justus"));
//        zombies.add(new Zombie("Jesus"));
//    }
//    
//    public void createStartBears() {
//        
//        Bear putin = new Bear("Putin");
//        putin.setLeben(999999999);
//        bears.add(putin);
//        bears.add(new Bear("Willy"));
//        bears.add(new Bear("Jens"));
//        bears.add(new Bear("Tyrone"));
//        bears.add(new Bear("Kevin"));
//        bears.add(new Bear("Julian"));
//        bears.add(new Bear("Zerberus"));
//        bears.add(new Bear("Judas"));
//    }
//    public void createAllItems() {
//        allItems.add(new Item());
//        allItems.add(new Item());
//        allItems.add(new Item());
//        allItems.add(new Item());
//        allItems.add(new Item());
//        allItems.add(new Item());
//        allItems.add(new Item());
//        allItems.add(new Item());
//        allItems.add(new Item());
//        allItems.add(new Item());
//    }
//     public void createStartPanda() {
//        
//        
//        Panda red = new Panda("Red");
//        red.setCuteness(9001);
//        red.setLeben(98);
//        red.setAngriff(987);
//        Pandas.add(red);
//        Pandas.add(new Panda("Blue"));
//        Pandas.add(new Panda("Grün"));
//        Pandas.add(new Panda("Violet"));
//        Pandas.add(new Panda("Cyan"));
//        Pandas.add(new Panda("Brun"));
//        Pandas.add(new Panda("Wis"));
//        
//    }
     
    
}