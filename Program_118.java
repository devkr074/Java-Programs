public class Program_118 {
    public static void main(String[] args) {
        int n = 352;
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}