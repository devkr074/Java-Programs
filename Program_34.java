public class Program_34 {
    public static void main(String[] args) {
        int countdown = 3;
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Happy New Year!!");
        int dice = 1;
        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("No Yatzy.");
            } else {
                System.out.println("Yatzy!");
            }
            dice = dice + 1;
        }
    }
}