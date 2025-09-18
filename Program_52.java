public class Program_52 {
    static void myMethod() {
        System.out.println("Hello World!");
    }

    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main(String[] args) {
        myMethod();
        myStaticMethod();
        Program_52 myObj = new Program_52();
        myObj.myPublicMethod();
    }
}

class Second {
    public static void main(String[] args) {
        Program_52 myCar = new Program_52();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}