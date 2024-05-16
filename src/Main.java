public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("VCS setup done...hopefully");

        //testing:
        String readMe = InputReader.readText("Zadej text k precteni:");
        System.out.println("Zadano: " + readMe);

        int readChoice = InputReader.readChoice(new String[]{"Neco", "Dalsi", "Na ukazku"});
        System.out.println("Vybrana moznost: " + readChoice);
    }
}
