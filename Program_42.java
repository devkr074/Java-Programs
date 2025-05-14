// Array of Objects in Java

public class Program_42 {
    public static void main(String[] args) {
        Car2[] cars = { new Car2("Mustang", "Red"),
                new Car2("Corvette", "Blue"),
                new Car2("Charger", "Yellow") };
        for (Car2 Car : cars) {
            Car.color = "black";
        }
        for (Car2 Car : cars) {
            Car.drive();
        }
    }
}