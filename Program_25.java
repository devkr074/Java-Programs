// Printing Elments of an Array

import java.util.Scanner;

public class Program_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("The entered integers are:");
        for (int num : numbers) {
            System.out.println(num);
        }
        scanner.close();
    }
}