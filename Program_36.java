// Appliance Class Hierarchy in Java

public class Program_36 {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine("LG", 2000, 7.5);
        wm.displayDetails();
    }
}

class Appliance {
    String brand;
    int power;

    public Appliance(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Power: " + power + " watts");
    }
}

class WashingMachine extends Appliance {
    double capacity;

    public WashingMachine(String brand, int power, double capacity) {
        super(brand, power);
        this.capacity = capacity;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Capacity: " + capacity + " kg");
    }
}