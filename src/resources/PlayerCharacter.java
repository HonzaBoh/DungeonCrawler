package resources;

public class PlayerCharacter extends Character{

    public PlayerCharacter(String name, int HP, int maxHP, int damage, int armor, int critChance) {
        super(name, HP, maxHP, damage, armor, critChance);
    }
    
    void combatAction(){
        String[] actions = {"Utok", "Obrana"};
        switch (InputReader.readChoice(actions)){
            case 1:
                ;
            case 2:
                ;
        }
    }
}
