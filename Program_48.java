public class Program_48 {
    int x = 5;

    public static void main(String[] args) {
        // Code here CANNOT use x
        int x = 100;
        // Code here CAN use x
        System.out.println(x);
        // Code here CANNOT use y
        { // This is a block
          // Code here CANNOT use y
            int y = 100;
            // Code here CAN use y
            System.out.println(y);
        } // The block ends here
          // Code here CANNOT use y
        for (int i = 0; i < 5; i++) {
            System.out.println(i); // i is accessible here
        }
        // i is NOT accessible here
        for (int i = 0; i < 3; i++) {
            System.out.println("Loop 1: " + i);
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("Loop 2: " + i);
        }
        Program_48 myObj = new Program_48();
        System.out.println(myObj.x); // Accessible here
    }
}