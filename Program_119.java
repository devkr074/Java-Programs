public class Program_119 {
    public static void main(String[] args) {
        int num = 153;
        int original = num;
        int result = 0;
        int digits = String.valueOf(num).length();
        while (num != 0) {
            int digit = num % 10;
            result += Math.pow(digit, digits);
            num /= 10;
        }
        System.out.println(original + (result == original ? " is Armstrong" : " is not Armstrong"));
    }
}