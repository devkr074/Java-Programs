// Getters and Setters in Java

public class Program_52 {
    public static void main(String[] args) {
        Car5 car = new Car5("Charger", "Yellow", 10000);
        car.setColor("Blue");
        car.setPrice(5000);
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}