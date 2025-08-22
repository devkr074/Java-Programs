// Difference between ++a and a++

import java.util.Scanner;

public class Program_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        int preIncrement = ++a;
        System.out.println("After pre-increment (++a): " + preIncrement);
        System.out.println("Value of a after pre-increment: " + a);
        a = a - 1;
        int postIncrement = a++;
        System.out.println("After post-increment (a++): " + postIncrement);
        System.out.println("Value of a after post-increment: " + a);
        scanner.close();
    }
}