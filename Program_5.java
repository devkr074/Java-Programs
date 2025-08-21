// User Input

import java.util.Scanner;

public class Program_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = sc.nextLine();
    System.out.print("Enter your age: ");
    int age = sc.nextInt();
    System.out.print("Enter your city: ");
    String city = sc.nextLine();
    System.out.println("Hello, " + name + "! You are " + age + " years old. You live in " + city + ".");
    sc.close();
  }
}