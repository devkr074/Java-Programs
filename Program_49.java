// Interface in Java

public class Program_49 {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish2 fish = new Fish2();
        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
}