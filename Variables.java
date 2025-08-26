public class Variables {
    public static void main(String[] args) {
        // Different ways to declare and initialize
        int age = 25; // Direct initialization
        double salary = 50000.50; // Decimal number
        char grade = 'A'; // Single character
        boolean isActive = true; // Boolean value
        String name = "John Doe"; // String (reference type)
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Active: " + isActive);

        // Declaration first, initialization later
        int count; // Declaration
        count = 10; // Initialization
        System.out.println("Count: " + count);

        // Multiple variables of same type
        int x = 5, y = 10, z = 15; // Multiple declaration
        System.out.println("x: " + x + ", y: " + y + ", z: " + z);

        // Constants (cannot be changed after initialization)
        final double PI = 3.14159; // Mathematical constant
        final int MAX_SIZE = 100; // Configuration constant
        System.out.println("PI: " + PI);
        System.out.println("Max Size: " + MAX_SIZE);

        // Different numeric literals
        int decimal = 100; // Decimal literal
        int binary = 0b1100100; // Binary literal (Java 7+)
        int octal = 0144; // Octal literal
        int hex = 0x64; // Hexadecimal literal
        long bigNumber = 1234567890L; // Long literal (L suffix)
        float precision = 3.14f; // Float literal (f suffix)
        double doublePrecision = 3.14159; // Double literal (default)
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hex);
        System.out.println("Big Number: " + bigNumber);
        System.out.println("Float Precision: " + precision);
        System.out.println("Double Precision: " + doublePrecision);
    }
}