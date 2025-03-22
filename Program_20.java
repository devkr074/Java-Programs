// Logical Operator in Java

public class Program_20 {
    public static void main(String[] args) {
        double temp = 35;
        boolean isSunny = true;
        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is GOOD 😀");
            System.out.println("It is SUNNY outside ☀");
        } else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is GOOD 😀");
            System.out.println("It is CLOUDY outside ☁");
        } else if (temp > 30 || temp < 0) {
            System.out.println("The weather is BAD 😩");
        }
    }
}