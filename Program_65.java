class Animal {
  public void makeSound() {
    System.out.println("Animal sound");
  }
}

interface Greeting {
  void sayHello();
}

public class Program_65 {
  public static void main(String[] args) {
    Animal myAnimal = new Animal() {
      public void makeSound() {
        System.out.println("Woof woof");
      }
    };
    Greeting greet = new Greeting() {
      public void sayHello() {
        System.out.println("Hello, World!");
      }
    };
    myAnimal.makeSound();
    greet.sayHello();
  }
}