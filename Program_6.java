// Swap Two Numbers in Java

public class Program_6 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before Swap: A=" + a + ",B=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap: A=" + a + ",B=" + b);
    }
}