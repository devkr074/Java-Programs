import java.util.ArrayList;

class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

public class Program_97 {
    @Deprecated
    static void oldMethod() {
        System.out.println("This method is outdated.");
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();
        oldMethod();
        ArrayList cars = new ArrayList();
        cars.add("Volvo");
        System.out.println(cars);
    }
}