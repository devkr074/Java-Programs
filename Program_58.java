// Second Largest Element in an Array in Java

public class Program_58 {
  public static void main(String[] args) {
    int[] numbers = { 5, 8, 2, 14, 7, 9 };
    int firstMax = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    for (int num : numbers) {
      if (num > firstMax) {
        secondMax = firstMax;
        firstMax = num;
      } else if (num > secondMax && num != firstMax) {
        secondMax = num;
      }
    }
    System.out.println("The second largest element is: " + secondMax);
  }
}