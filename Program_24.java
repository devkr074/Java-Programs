// Stop loop when number is 7

public class Program_24 {
    public static void main(String[] args) {
        int number = 1;
        while (number <= 10) {
            if (number == 7) {
                break;
            }
            System.out.println(number);
            number++;
        }
    }
}