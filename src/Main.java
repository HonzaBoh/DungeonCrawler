import managers.Combat;
import resources.*;

public class Main {
    public static void main(String[] args) {
        PlayerCharacter pepa = new PlayerCharacter("Pepa", 100, 10, 5);
        System.out.println("Vytvorena postava: ");
        pepa.getCharacterSheet();
        System.out.println();
        Extras.dramaticPause(2000);

        PlayerCharacter karel = new PlayerCharacter("Karel", 90, 20, 5);

        Group players = new Group(pepa);
        players.addMember(karel);
        System.out.println("Pripravena skupina: ");
        players.printGroupInfo();
        System.out.println();
        Extras.dramaticPause(2000);

        Weapon sword = new Weapon("Zweihander", 30, 10);
        pepa.equipWeapon(sword);
        pepa.getCharacterSheet();
        System.out.println();
        Extras.dramaticPause(2000);

        Enemy orc = new Enemy("Orc warrior", 150, 10, 3, false);
        orc.getCharacterSheet();
        System.out.println();
        Extras.dramaticPause(2000);
        Enemy goblin = new Enemy("Goblin archer", 50, 20, 5, false);

        Group enemies = new Group(orc);
        enemies.addMember(goblin);
        System.out.println("Nepratelska skupina: ");
        enemies.printGroupInfo();
        System.out.println();

        Combat combat = new Combat();
        combat.initiateCombat(players, enemies);
    }
}
