package resources;

import java.util.Scanner;

public class InputReader {
    private static final Scanner sc = new Scanner(System.in);

    public static String readText(String prompt){
        System.out.println(prompt);
        return sc.nextLine();
    }

    public static int readChoice(String[] choices){
        int choice;
        do {
            System.out.println("Vyber možnost:");
            for (int i = 0; i < choices.length; i++) {
                System.out.println((i+1) + ": " + choices[i]);
            }
            choice = sc.nextInt()-1;
        }while (choice < 0 || choice >= choices.length);
        return choice;
    }

}
