public class Program_35 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
        }
        System.out.println("Sum is " + sum);
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
        for (int i = 10; i < 5; i++) {
            System.out.println("This will never be printed");
        }
    }
}