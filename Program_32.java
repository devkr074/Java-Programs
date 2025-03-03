// Vehicle Class Hierarchy in Java

public class Program_32 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 4);
        myCar.displayInfo();
    }
}

class Vehicle {
    String make;
    String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    public Car(String make, String model, int numberOfDoors) {
        super(make, model);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}