// Polymorphism in Java

public class Program_50 {
    public static void main(String[] args) {
        Car4 car = new Car4();
        Bike bike = new Bike();
        Boat boat = new Boat();
        Vehicle[] vehicles = { car, bike, boat };
        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
    }
}