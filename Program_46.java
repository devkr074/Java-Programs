// Abstraction in Java (Device Class)

abstract class Device {
  abstract void turnOn();

  void turnOff() {
    System.out.println("Device turned off.");
  }
}

class Laptop extends Device {
  @Override
  void turnOn() {
    System.out.println("Laptop turned on.");
  }
}

class Smartphone extends Device {
  @Override
  void turnOn() {
    System.out.println("Smartphone turned on.");
  }
}

public class Program_46 {
  public static void main(String[] args) {
    Device myLaptop = new Laptop();
    Device mySmartphone = new Smartphone();
    myLaptop.turnOn();
    myLaptop.turnOff();
    mySmartphone.turnOn();
    mySmartphone.turnOff();
  }
}