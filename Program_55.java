// Occurence of Specific Element in an Array in Java

public class Program_55 {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 2, 2, 5, 2 };
    int target = 2;
    int count = 0;
    for (int num : numbers) {
      if (num == target) {
        count++;
      }
    }
    System.out.println("The number " + target + " occurs " + count + " times.");
  }
}