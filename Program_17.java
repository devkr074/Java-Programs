public class Program_17 {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
        int z = 5;
        ++z;
        System.out.println(z);
        --z;
        System.out.println(z);
        int a = 10;
        int b = 3;
        System.out.println(a / b);
        double c = 10.0d;
        double d = 3.0d;
        System.out.println(c / d);
        int e = 10;
        e += 5;
        System.out.println(e);
        int age = 18;
        System.out.println(age >= 18);
        System.out.println(age < 18);
        boolean isLoggedIn = true;
        boolean isAdmin = false;
        System.out.println("Regular user: " + (isLoggedIn && !isAdmin));
        System.out.println("Has access: " + (isLoggedIn || isAdmin));
        System.out.println("Not logged in: " + (!isLoggedIn));
    }
}