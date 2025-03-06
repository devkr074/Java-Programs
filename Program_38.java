// Polymorphism in Java (Animal Sounds)

class Animal {
  void sound() {
    System.out.println("This animal makes a sound.");
  }
}

class Dog extends Animal {
  @Override
  void sound() {
    System.out.println("Woof!");
  }
}

class Cat extends Animal {
  @Override
  void sound() {
    System.out.println("Meow!");
  }
}

public class Program_38 {
  public static void main(String[] args) {
    Animal myDog = new Dog();
    Animal myCat = new Cat();
    myDog.sound();
    myCat.sound();
  }
}