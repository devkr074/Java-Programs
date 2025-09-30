import java.util.ArrayList;
import java.util.function.Consumer;

interface StringFunction {
    String run(String str);
}

interface Greeting {
    void sayHello();
}

public class Program_100 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach((n) -> {
            System.out.println(n);
        });
        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        };
        numbers.forEach(method);
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
        Greeting greet = new Greeting() {
            public void sayHello() {
                System.out.println("Hello from anonymous class");
            }
        };
        greet.sayHello();
        Greeting greet2 = () -> System.out.println("Hello from lambda");
        greet2.sayHello();
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}