// Sum of elements of an Array

import java.util.Scanner;

public class Program_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("The sum of the entered integers is: " + sum);
        scanner.close();
    }
}