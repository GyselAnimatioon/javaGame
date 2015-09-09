package test;

public class Panda {

    private int leben = 100;
    private int angriff = 10;
    private String name = "Panda";
    private int level = 1;
    private int xp = 0;
    private int cuteness = 0;

    public Panda(String name) {
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
    public void setCuteness(int cuteness) {
        this.cuteness = cuteness;
    }
    public int getCuteness() {
        return cuteness;
    }
    public void setAngriff(int angriff) {
        this.angriff = angriff;
    }
    public int getAngrif(){
        return angriff;
    }

}
