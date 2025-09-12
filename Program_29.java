public class Program_29 {
    public static void main(String[] args) {
        int a = 200;
        int b = 33;
        int c = 500;
        if (a > b && c > a) {
            System.out.println("Both conditions are true");
        }
        if (a > b || a > c) {
            System.out.println("At least one condition is true");
        }
        if (!(b > a)) {
            System.out.println("b is NOT greater than a");
        }
        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 3;
        if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
    }
}