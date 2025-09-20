public class Program_61 {
  public static void main(String[] args) {
    Dog myDog = new Dog();
    myDog.printType();
    myDog.animalSound();
  }
}

class Animal {
  String type = "Animal";

  Animal() {
    System.out.println("Animal is created");
  }

  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Dog extends Animal {
  String type = "Dog";

  Dog() {
    super();
    System.out.println("Dog is created");
  }

  public void printType() {
    System.out.println(super.type);
  }

  public void animalSound() {
    super.animalSound();
    System.out.println("The dog says: bow wow");
  }
}