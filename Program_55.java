public class Program_55 {
  public static void main(String[] args) {
    Person p = new Person();
    System.out.println(p.name);
    // System.out.println(p.age);
  }
}

class Person {
  public String name = "John";
  private int age = 30;
}