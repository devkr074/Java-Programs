// Greater Number

import java.util.Scanner;

public class Program_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int greater = (num1 > num2) ? num1 : num2;
        System.out.println("Greater number is: " + greater);
        scanner.close();
    }
}