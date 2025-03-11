// Reverse an Array in Java

public class Program_53 {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 5 };
    int n = numbers.length;
    for (int i = 0; i < n / 2; i++) {
      int temp = numbers[i];
      numbers[i] = numbers[n - i - 1];
      numbers[n - i - 1] = temp;
    }
    System.out.println("Reversed array: " + java.util.Arrays.toString(numbers));
  }
}