// Difference of Two Numbers in Java

import java.util.Scanner;

public class Program_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int num1 = sc.nextInt();
    System.out.print("Enter the second number: ");
    int num2 = sc.nextInt();
    int diff = num1 + num2;
    System.out.println("The difference is: " + diff);
    sc.close();
  }
}