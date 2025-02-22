// Temperature Convertor in Java

import java.util.Scanner;

public class Program_7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Temperature in Celsius: ");
    double celsius = sc.nextDouble();
    double fahrenheit = (celsius * 9 / 5) + 32;
    System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    sc.close();
  }
}