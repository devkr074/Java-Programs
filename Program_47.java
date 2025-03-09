// Encapsulation in Java (Person Class)

public class Program_47 {
  private String name;
  private int age;

  public Program_47(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age > 0) {
      this.age = age;
    } else {
      System.out.println("Age must be positive.");
    }
  }

  public void displayInfo() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
  }

  public static void main(String[] args) {
    Program_47 person = new Program_47("Alice", 25);
    person.displayInfo();
    person.setName("Bob");
    person.setAge(30);
    person.displayInfo();
  }
}