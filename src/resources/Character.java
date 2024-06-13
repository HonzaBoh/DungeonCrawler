package resources;

public class Character {
    String name;
    int HP;
    int maxHP;
    int damage;
    int critChance;
    Weapon weapon;
    Armor armor;

    public Character(String name, int maxHP, int damage, int critChance) {
        this.name = name;
        this.HP = maxHP;
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
        System.out.println("Max DMG: " + getMaxDMG());
        System.out.println("Armor value: " + getArmor());
        System.out.println("Critical chance: " + getCritChance() + " %");
    }



    int getDamageValue(){
//        if ((int)(Math.random() * 100 + 1) <= (critChance + weapon.critChance)){
//            System.out.println(name + " landed a critical strike");
//            return (damage + weapon.damage) * 2;
//        }
//
////        return (damage + weapon.damage) ;
        if (weapon == null){
            return (int)(Math.random() * 100 + 1) <= critChance ? damage * 2 : damage;
        }

        return (int)(Math.random() * 100 + 1) <= (critChance + weapon.critChance) ? (damage + weapon.damage) * 2 : (damage + weapon.damage);
    }

    public int getMaxDMG(){
       return  weapon == null ? damage : damage + weapon.damage;
    }

    public int getCritChance(){
        return  weapon == null ? critChance : critChance + weapon.critChance;
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
