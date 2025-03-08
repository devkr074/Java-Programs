// Abstraction in Java (Vehicle Interface)

interface Vehicle {
  void startEngine();

  void stopEngine();
}

class Car implements Vehicle {
  @Override
  public void startEngine() {
    System.out.println("Car engine started.");
  }

  @Override
  public void stopEngine() {
    System.out.println("Car engine stopped.");
  }
}

class Bike implements Vehicle {
  @Override
  public void startEngine() {
    System.out.println("Bike engine started.");
  }

  @Override
  public void stopEngine() {
    System.out.println("Bike engine stopped.");
  }
}

public class Program_44 {
  public static void main(String[] args) {
    Vehicle myCar = new Car();
    Vehicle myBike = new Bike();
    myCar.startEngine();
    myBike.startEngine();
    myCar.stopEngine();
    myBike.stopEngine();
  }
}