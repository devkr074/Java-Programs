import java.util.HashSet;
import java.util.Set;

public class Program_87 {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        var cars2 = new HashSet<String>();
        Set<String> cars3 = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        cars.contains("Mazda");
        cars.remove("Volvo");
        cars.size();
        for (String i : cars) {
            System.out.println(i);
        }
        cars.clear();
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }
    }
}