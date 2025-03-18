// if Statement in Java

import java.util.Scanner;

public class Program_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        boolean isStudent;
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        System.out.print("Are you a student (true/false): ");
        isStudent = scanner.nextBoolean();
        if (name.isEmpty()) {
            System.out.println("You didn't enter your name! 😡");
        } else {
            System.out.println("Hello " + name + "! 😀");
        }
        if (age >= 65) {
            System.out.println("You are a senior! 👴");
        } else if (age >= 18) {
            System.out.println("You are an adult! 🧑");
        } else if (age < 0) {
            System.out.println("You haven't been born yet! 👼");
        } else if (age == 0) {
            System.out.println("You are a baby! 👶");
        } else {
            System.out.println("You are a child! 🧒");
        }
        if (isStudent) {
            System.out.println("You are a student! 🏫");
        } else {
            System.out.println("You are NOT a student 🏢");
        }
        scanner.close();
    }
}