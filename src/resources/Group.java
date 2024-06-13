package resources;

import java.util.ArrayList;

public class Group {
    ArrayList<Character> members;

    public Group(Character firstMember) {
        members = new ArrayList<>();
        members.add(firstMember);
    }

    public ArrayList<Character> getMembers() {
        return members;
    }

    public void addMember(Character toAdd){
        if (members.size() >= 4){
            System.out.println("Skupina je již plná");
            System.out.println("Postavu " + toAdd.name + " nelze přidat.");
            return;
        }
        members.add(toAdd);
        System.out.println("Do skupiny byla přidána postava: " + toAdd.name);
    }

    public void printGroupInfo(){
        System.out.println("Skupina: ");
        for (Character member : members){
            System.out.println("-----");
            member.getCharacterSheet();
        }
    }
}
