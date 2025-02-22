// Check Even or Odd in Java

import java.util.Scanner;

public class Program_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    if (num % 2 == 0) {
      System.out.println(num + " is even.");
    } else {
      System.out.println(num + " is odd.");
    }
    sc.close();
  }
}