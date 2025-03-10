// Largest Element in an Array in Java

public class Program_51 {
    public static void main(String[] args) {
        int[] numbers = { 5, 8, 2, 14, 7, 9 };
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The largest element is: " + max);
    }
}