package resources;

public class Armor {
    String name;
    int armorValue;

    public Armor(String name, int armorValue) {
        this.name = name;
        this.armorValue = armorValue;
    }

    @Override
    public String toString() {
        return name + ": " + armorValue;
    }
}
