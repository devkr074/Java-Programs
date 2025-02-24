// Logical Operations in Java

import java.util.Scanner;

public class Program_13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first boolean value (true/false):");
    boolean b1 = sc.nextBoolean();
    System.out.println("Enter the second boolean value (true/false):");
    boolean b2 = sc.nextBoolean();
    System.out.println("Enter the third boolean value (true/false):");
    boolean b3 = sc.nextBoolean();
    System.out.println("First Value && Second Value: " + (b1 && b2));
    System.out.println("First Value || Second Value: " + (b1 || b2));
    System.out.println("!First Value: " + (!b1));
    System.out.println("First Value && Second Value && Third Value: " + (b1 && b2 && b3));
    System.out.println("First Value || Second Value || Third Value: " + (b1 || b2 || b3));
    sc.close();
  }
}