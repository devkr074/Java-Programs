// Multiplication Table in Java

import java.util.Scanner;

public class Program_21 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    int num = sc.nextInt();
    for (int i = 1; i <= 10; i++) {
      System.out.println(num + " x " + i + " = " + num * i);
    }
    sc.close();
  }
}