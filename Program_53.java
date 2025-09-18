public class Program_53 {
    int x;
    int modelYear;
    String modelName;

    public Program_53() {
        x = 5;
    }

    public Program_53(int y) {
        x = y;
    }

    public Program_53(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Program_53 myObj = new Program_53();
        Program_53 myObj2 = new Program_53(10);
        Program_53 myCar = new Program_53(1969, "Mustang");
        System.out.println(myObj.x);
        System.out.println(myObj2.x);
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}