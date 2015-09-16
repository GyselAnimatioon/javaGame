package mobs;

import interfaces.IntMob;

public class Pacman implements IntMob {

    private int life = 100;

    @Override
    public int getLiveAfterDamage(int schaden) {

        return 0;
    }

    @Override
    public int getDamage(int angriff, int angriffsModifier) {
        return 0;

    }

}
