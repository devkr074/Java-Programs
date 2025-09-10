public class Program_19 {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        String name = "John";
        int age = 25;
        System.out.println("My name is " + name + " and I am " + age + " years old.");
        System.out.println(firstName.concat(lastName));
        String a = "Java ";
        String b = "is ";
        String c = "fun!";
        String result = a.concat(b).concat(c);
        System.out.println(result);
    }
}