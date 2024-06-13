package resources;

public class Extras {
    public static void dramaticPause(int millis){
        try{
            Thread.sleep(millis);
        } catch (InterruptedException er){
            System.out.println("Thread died :(");
        }
    }
}
