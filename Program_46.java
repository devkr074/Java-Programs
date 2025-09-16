public class Program_46 {
    static int myMethod(int x, int y) {
        return x + y;
    }

    static int doubleGame(int x) {
        return x * 2;
    }

    public static void main(String[] args) {
        int z = myMethod(5, 3);
        System.out.println(z);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Double of " + i + " is " + doubleGame(i));
        }
    }
}