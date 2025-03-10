// Sum of Elements in an Array in Java

public class Program_52 {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 5 };
    int sum = 0;
    for (int num : numbers) {
      sum += num;
    }
    System.out.println("The sum of all elements is: " + sum);
  }
}