package mobs;

import interfaces.IntMob;

public class Panda implements IntMob {

    private int leben = 100;
    private int angriff = 10;
    private String name = "Panda";
    private int level = 1;
    private int xp = 0;
    private int cuteness = 0;

    public Panda(String name) {
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
