package resources;

public class Weapon {
    String name;
    int damage, critChance;

    public Weapon(String name, int damage, int critChance) {
        this.name = name;
        this.damage = damage;
        this.critChance = critChance;
    }

    @Override
    public String toString() {
        return name + ": " + damage + "(" + critChance + " %)";
    }
}
