// Strings and Methods in Java

public class Program_6 {
    public static void main(String[] args) {
        String str = new String("Hello World");
        String str2 = new String("Hello Java");
        System.out.println(str.length());
        System.out.println(str.charAt(1));
        System.out.println(str.substring(7, 11));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.contains("World"));
        System.out.println(str.replace('l', 'p'));
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.trim());
    }
}