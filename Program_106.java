import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN;
        }
        return a / b;
    }
}

public class Program_106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        try (FileWriter writer = new FileWriter("calculator_log.txt", true)) {
            System.out.println("=== Simple Calculator ===");
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            System.out.println("Choose operation: +, -, *, /");
            char op = sc.next().charAt(0);
            double result = 0;
            String operation = "";
            switch (op) {
                case '+':
                    result = calc.add(num1, num2);
                    operation = num1 + " + " + num2;
                    break;
                case '-':
                    result = calc.subtract(num1, num2);
                    operation = num1 + " - " + num2;
                    break;
                case '*':
                    result = calc.multiply(num1, num2);
                    operation = num1 + " * " + num2;
                    break;
                case '/':
                    result = calc.divide(num1, num2);
                    operation = num1 + " / " + num2;
                    break;
                default:
                    System.out.println("Invalid operation!");
                    return;
            }
            System.out.println("Result: " + result);
            writer.write(operation + " = " + result + "\n");
            System.out.println("Calculation saved to calculator_log.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file.");
        }
        sc.close();
    }
}