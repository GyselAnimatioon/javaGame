package mobs;

import interfaces.IntMob;

public class Bear implements IntMob {

    private int health = 100;
    private int attack = 10;
    private String name = "Bear";
    private int level = 1;
    private int xp = 0;

    public Bear(String name) {
        this.name = name;
    }

    @Override
    public int getLiveAfterDamage(int damage) {
        this.health = this.health - damage;
        System.out.println(name + "> I got attacked. ");
        System.out.println(name + "> I have now " + health + " live.");
        return this.health;
    }

    @Override
    public int getDamage(int attack, int attackModifier ){
        int damage = attack * attackModifier;
        return damage;
    }

}
