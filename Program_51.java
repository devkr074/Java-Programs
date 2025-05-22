// Runtime Polymorphism in Java

import java.util.Scanner;

public class Program_51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal3 animal;
        System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            animal = new Dog3();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat3();
            animal.speak();
        }
        scanner.close();
    }
}