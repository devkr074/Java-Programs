public class Program_51 {
    int x = 5;
    int y = 3;
    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {
        Program_51 myObj = new Program_51();
        Program_51 myObj2 = new Program_51();
        Program_51 myObj3 = new Program_51();
        System.out.println(myObj.x);
        myObj.x = 40;
        System.out.println(myObj.x);
        myObj2.x = 25;
        System.out.println(myObj2.x);
        System.out.println("Name: " + myObj3.fname + " " + myObj3.lname);
        System.out.println("Age: " + myObj3.age);
    }
}