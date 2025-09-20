public class Program_59 extends Vehicle {
    private String modelName = "Mustang";

    public static void main(String[] args) {
        Program_59 myCar = new Program_59();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}

class Vehicle {
    protected String brand = "Ford";

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}