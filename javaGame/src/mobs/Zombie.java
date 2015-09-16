package mobs;

import interfaces.IntMob;

public class Zombie implements IntMob {

    private int leben = 100;
    private int angriff = 10;
    private String name = "Zombie";
    private int level = 1;
    private int xp = 0;

    public Zombie(String name) {
        this.name = name;
    }

    @Override
    public int getLiveAfterDamage(int schaden) {
        this.leben -= schaden;
        return this.leben;
    }

    @Override
    public int getDamage(int angriff, int angriffsModifier) {
        int schaden = angriff * angriffsModifier;
        return schaden;
    }

}
