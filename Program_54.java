public class Program_54 {
    int x;
    int modelYear;
    String modelName;

    public Program_54(int x) {
        this.x = x;
    }

    public Program_54(String modelName) {
        this(2020, modelName);
    }

    public Program_54(int modelYear, String modelName) {
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public void printInfo() {
        System.out.println(modelYear + " " + modelName);
    }

    public static void main(String[] args) {
        Program_54 myObj = new Program_54(5);
        Program_54 car1 = new Program_54("Corvette");
        Program_54 car2 = new Program_54(1969, "Mustang");
        System.out.println("Value of x = " + myObj.x);
        car1.printInfo();
        car2.printInfo();
    }
}