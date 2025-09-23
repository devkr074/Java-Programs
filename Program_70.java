public class Program_70 {
    public static void main(String[] args) {

        // Compile-Time Errors

        // int x = 5 // Missing Semicolon
        // System.out.println(x);
        // System.out.println(myVar); // Undeclared Variable
        // int x = "Hello"; // Mismatched Type

        // Runtime Errors

        int x = 10;
        int y = 0;
        int result = x / y; // Division by Zero
        System.out.println(result);
        int[] numbers = { 1, 2, 3 };
        System.out.println(numbers[8]); // Array Index Out of Bounds

        // Logical Errors

        x = 10;
        y = 2;
        int sum = x - y;
        System.out.println("x + y = " + sum);
    }
}