// Factorial of a Number in Java

import java.util.Scanner;

public class Program_18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    int num = sc.nextInt();
    int factorial = 1;
    for (int i = 1; i <= num; i++) {
      factorial *= i;
    }
    System.out.println("Factorial of " + num + " is: " + factorial);
    sc.close();
  }
}