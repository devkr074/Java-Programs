// Print Numbers from 1 to N in Java

import java.util.Scanner;

public class Program_16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    int N = sc.nextInt();
    for (int i = 1; i <= N; i++) {
      System.out.println(i);
    }
    sc.close();
  }
}