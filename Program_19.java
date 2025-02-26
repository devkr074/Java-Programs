// Reverse a Number in Java

import java.util.Scanner;

public class Program_19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    int num = sc.nextInt();
    int reverse = 0;
    while (num != 0) {
      int digit = num % 10;
      reverse = reverse * 10 + digit;
      num /= 10;
    }
    System.out.println("Reversed number: " + reverse);
    sc.close();
  }
}