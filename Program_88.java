import java.util.Set;
import java.util.TreeSet;

public class Program_88 {
    public static void main(String[] args) {
        TreeSet<String> cars = new TreeSet<>();
        var cars2 = new TreeSet<String>();
        Set<String> cars3 = new TreeSet<>();
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
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        for (int n : numbers) {
            System.out.println(n);
        }
    }
}