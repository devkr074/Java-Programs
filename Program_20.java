// Fibonacci Series in Java

import java.util.Scanner;

public class Program_20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of terms: ");
    int N = sc.nextInt();
    int t1 = 0, t2 = 1;
    int count = 1;
    System.out.print("First " + N + " terms: ");
    do {
      System.out.print(t1 + " ");
      int sum = t1 + t2;
      t1 = t2;
      t2 = sum;
      count++;
    } while (count <= N);
    sc.close();
  }
}