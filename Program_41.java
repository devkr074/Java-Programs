// Polymorphism in Java (Vehicle Hierarchy)

abstract class Vehicle {
  String make;
  String model;

  public Vehicle(String make, String model) {
    this.make = make;
    this.model = model;
  }

  abstract double fuelEfficiency();
}

class Car extends Vehicle {
  double milesPerGallon;

  public Car(String make, String model, double milesPerGallon) {
    super(make, model);
    this.milesPerGallon = milesPerGallon;
  }

  @Override
  double fuelEfficiency() {
    return milesPerGallon;
  }
}

class Bike extends Vehicle {
  double milesPerLiter;

  public Bike(String make, String model, double milesPerLiter) {
    super(make, model);
    this.milesPerLiter = milesPerLiter;
  }

  @Override
  double fuelEfficiency() {
    return milesPerLiter;
  }
}

public class Program_41 {
  public static void main(String[] args) {
    Vehicle myCar = new Car("Toyota", "Corolla", 30);
    Vehicle myBike = new Bike("Yamaha", "YZF-R3", 40);
    System.out.println("Car Fuel Efficiency: " + myCar.fuelEfficiency() + " MPG");
    System.out.println("Bike Fuel Efficiency: " + myBike.fuelEfficiency() + " MPL");
  }
}