// Largest of Three Numbers in Java

import java.util.Scanner;

public class Program_24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three integers:");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    if (num1 >= num2 && num1 >= num3) {
      System.out.println("The largest number is " + num1);
    } else if (num2 >= num1 && num2 >= num3) {
      System.out.println("The largest number is " + num2);
    } else {
      System.out.println("The largest number is " + num3);
    }
    sc.close();
  }
}