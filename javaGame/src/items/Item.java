package items;

public class Item {

    private String name = "Default Item Name";
    private String imagePath = "C:/txr/image1.png";
    private boolean attackable = false;
    private int damage = 0;
    private int durability = 100;
    private boolean exist = true;

    public Item() {
        
    }
    

    public boolean durabilityCheck() {
        if (damage == 0) {
            this.exist = false;
            return false;
        } else {
            this.durability = this.durability - 1;
            return true;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public boolean isAttackable() {
        return attackable;
    }

    public void setAttackable(boolean attackable) {
        this.attackable = attackable;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

}
