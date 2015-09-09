package test;

public class Bear {

    private int leben = 100;
    private int angriff = 10;
    private String name = "Bear";
    private int level = 1;
    private int xp = 0;

    public Bear(String name) {
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

}