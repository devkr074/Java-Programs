// Area of Circle in Java

import java.util.Scanner;

public class Program_9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the radius of the circle: ");
    double radius = sc.nextDouble();
    double area = Math.PI * radius * radius;
    System.out.println("Area of the circle: " + area);
    sc.close();
  }
}