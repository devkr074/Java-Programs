// Simple Interest Calculator in Java

import java.util.Scanner;

public class Program_8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter principal amount: ");
    double principal = sc.nextDouble();
    System.out.print("Enter rate of interest: ");
    double rate = sc.nextDouble();
    System.out.print("Enter time period in years: ");
    int time = sc.nextInt();
    double simpleInterest = (principal * rate * time) / 100;
    System.out.println("Simple Interest: " + simpleInterest);
    sc.close();
  }
}