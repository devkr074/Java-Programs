// Positive, Negative, or Zero in Java

import java.util.Scanner;

public class Program_22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int num = sc.nextInt();
    if (num > 0) {
      System.out.println("The number is positive.");
    } else if (num < 0) {
      System.out.println("The number is negative.");
    } else {
      System.out.println("The number is zero.");
    }
    sc.close();
  }
}