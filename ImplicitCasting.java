public class ImplicitCasting {
    public static void main(String[] args) {
        // Smaller to larger type - no data loss
        byte b = 10;
        short s = b; // byte → short
        int i = s; // short → int
        long l = i; // int → long
        float f = l; // long → float
        double d = f; // float → double
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);

        // Char casting
        char c = 'A';
        int ascii = c; // char → int (gets ASCII value 65)
        System.out.println("char: " + c);
        System.out.println("ASCII of char: " + ascii);
    }
}