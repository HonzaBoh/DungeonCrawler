package resources;

public class Character {
    String name;
    int HP;
    int maxHP;
    int damage;
    int critChance;
    Weapon weapon;
    Armor armor;

    public Character(String name, int HP, int maxHP, int damage, int critChance) {
        this.name = name;
        this.HP = HP;
        this.maxHP = maxHP;
        this.damage = damage;
        this.critChance = critChance;
    }

    @Override
    public String toString() {
        return name + " [" + HP + "/" + maxHP + "]";
    }

    public void getCharacterSheet(){
        System.out.println("Name: " + name);
        System.out.println("HP: [" + HP + "/" + maxHP + "]");
        System.out.println("Max DMG: " + damage);
        System.out.println("Armor value: " + armor);
        System.out.println("Critical chance: " + critChance);
    }



    int getDamageValue(){
        return 0;
    }

    public void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void equipArmor(Armor armor){
        this.armor = armor;
    }

    public int getArmor() {
        if (armor == null){
            return 0;
        }
        return armor.armorValue;
    }
}
