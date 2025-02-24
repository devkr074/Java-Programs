// Conditional (Ternary) Operator in Java

import java.util.Scanner;

public class Program_15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int num1 = sc.nextInt();
    System.out.print("Enter the second number: ");
    int num2 = sc.nextInt();
    int max = (num1 > num2) ? num1 : num2;
    System.out.println("The larger number is: " + max);
    sc.close();
  }
}