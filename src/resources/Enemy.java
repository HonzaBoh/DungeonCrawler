package resources;

public class Enemy extends Character {
    boolean drops;

    public Enemy(String name, int maxHP, int damage, int critChance, boolean drops) {
        super(name, maxHP, damage, critChance);
        this.drops = drops;
    }
}
