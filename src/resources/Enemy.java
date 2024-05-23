package resources;

public class Enemy extends Character {
    boolean drops;

    public Enemy(String name, int HP, int maxHP, int damage, int critChance, boolean drops) {
        super(name, HP, maxHP, damage, critChance);
        this.drops = drops;
    }
}
