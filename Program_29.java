// Search for an element in an Array

import java.util.Scanner;

public class Program_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Enter an integer to search for:");
        int target = scanner.nextInt();
        boolean found = false;
        for (int num : numbers) {
            if (num == target) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The integer " + target + " is present in the array.");
        } else {
            System.out.println("The integer " + target + " is not present in the array.");
        }
        scanner.close();
    }
}