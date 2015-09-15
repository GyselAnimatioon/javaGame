package test;

public class Zombie implements IntMob {

    private int leben = 100;
    private int angriff = 10;
    private String name = "Zombie";
    private int level = 1;
    private int xp = 0;

    public Zombie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getLeben() {
        return leben;
    }
    
    public void setLeben(int leben) {
        this.leben = leben;
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
