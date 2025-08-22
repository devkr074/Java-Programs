// Bitwise AND, OR, XOR

import java.util.Scanner;

public class Program_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int andResult = num1 & num2;
        int orResult = num1 | num2;
        int xorResult = num1 ^ num2;
        System.out.println("Bitwise AND: " + andResult);
        System.out.println("Bitwise OR: " + orResult);
        System.out.println("Bitwise XOR: " + xorResult);
        scanner.close();
    }
}