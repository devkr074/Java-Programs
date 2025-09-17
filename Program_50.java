public class Program_50 {
    int x = 5;

    public static void main(String[] args) {
        Program_50 myObj1 = new Program_50();
        Program_50 myObj2 = new Program_50();
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}

class Second {
    public static void main(String[] args) {
        Program_50 myObj = new Program_50();
        System.out.println(myObj.x);
    }
}