// Character Input

import java.util.Scanner;

public class Program_8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a character: ");
    char character = sc.next().charAt(0);
    System.out.println("You entered: " + character);
    sc.close();
  }
}