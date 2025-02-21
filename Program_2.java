// Print Name in Java

import java.util.Scanner;

public class Program_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Name: ");
    String name = sc.nextLine();
    System.out.println("Hi, My name is " + name + ".\nMy Favourite Programming Language is Java.");
    sc.close();
  }
}