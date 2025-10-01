import java.util.Scanner;

public class Program_102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Hi " + name + "! You will turn " + (age + 1) + " next year.");
        scanner.close();
    }
}