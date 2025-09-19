public class Program_56 {
    final int x = 10;
    final double PI = 3.14;

    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        Program_56 myObj = new Program_56();
        Program_56 myObj2 = new Program_56();
        // myObj.x = 50;
        // myObj.PI = 25;
        System.out.println(myObj.x);
        myStaticMethod();
        // myPublicMethod();
        myObj2.myPublicMethod();
    }
}