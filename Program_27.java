// Class in Java (Person Class)

public class Program_27 {
  public static void main(String[] args) {
    Person person = new Person("Alice", 30);
    person.displayInfo();
  }
}

class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void displayInfo() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
  }
}