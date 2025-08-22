// Voting Eligibility

import java.util.Scanner;

public class Program_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        String eligibility = (age >= 18) ? "eligible" : "not eligible";
        System.out.println("You are " + eligibility + " to vote.");
        scanner.close();
    }
}