public class Program_24 {
    public static void main(String[] args) {
        boolean isRaining = true;
        if (isRaining) {
            System.out.println("Bring an umbrella!");
        }
        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }
        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }
        y = 20;
        if (x == y) {
            System.out.println("x is equal to y");
        }
        boolean isLightOn = true;
        if (isLightOn) {
            System.out.println("The light is on.");
        }
        System.out.println("This line runs no matter what, because it is outside the if statement.");
        if (20 > 18)
            System.out.println("20 is greater than 18");
        y = 18;
        if (x > y)
            System.out.println("x is greater than y");
        System.out.println("This line runs no matter what (not part of the if statement)");
        if (x > y) {
            System.out.println("x is greater than y");
            System.out.println("Both lines are part of the if");
        }
    }
}