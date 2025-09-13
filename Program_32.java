public class Program_32 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        int countdown = 3;
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Happy New Year!!");
        i = 10;

        while (i < 5) {
            System.out.println("This will never be printed");
        }
    }
}