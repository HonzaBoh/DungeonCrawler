package managers;

import resources.Character;
import resources.Group;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Combat {
    Group playerGroup, enemyGroup;
    Queue<Character> turns;
    public void initiateCombat(Group playerGroup, Group enemyGroup){
        this.playerGroup = playerGroup;
        this.enemyGroup = enemyGroup;

        System.out.println("Začal souboj:");

        ArrayList<Character> pool = new ArrayList<>();
        pool.addAll(playerGroup.getMembers());
        pool.addAll(enemyGroup.getMembers());
        Collections.shuffle(pool);
        turns = new LinkedList<>(pool);
        System.out.println("test....");
        getCombatPriorities();
        System.out.println("TODO: combat...");
    }

    void getCombatPriorities(){
        System.out.println("Hraje se v pořadí: ");
        for (Character character : turns){
            System.out.println(character.toString());
        }
    }





}
