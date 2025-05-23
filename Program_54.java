// Composition in Java

public class Program_54 {
    public static void main(String[] args) {
        Car6 car = new Car6("Corvette", 2025, "V8");
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);
        car.start();
    }
}