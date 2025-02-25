// Sum of First N Natural Numbers

import java.util.Scanner;

public class Program_17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    int N = sc.nextInt();
    int sum = 0;
    for (int i = 1; i <= N; i++) {
      sum += i;
    }
    System.out.println("Sum of first " + N + " natural numbers: " + sum);
    sc.close();
  }
}