// Palindromic Array Check in Java

public class Program_59 {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 2, 1 };
    boolean isPalindromic = true;
    for (int i = 0; i < numbers.length / 2; i++) {
      if (numbers[i] != numbers[numbers.length - i - 1]) {
        isPalindromic = false;
        break;
      }
    }
    if (isPalindromic) {
      System.out.println("The array is palindromic.");
    } else {
      System.out.println("The array is not palindromic.");
    }
  }
}