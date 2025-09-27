import java.util.LinkedHashSet;
import java.util.Set;

public class Program_89 {
    public static void main(String[] args) {
        LinkedHashSet<String> cars = new LinkedHashSet<>();
        var cars2 = new LinkedHashSet<String>();
        Set<String> cars3 = new LinkedHashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        cars.contains("Mazda");
        cars.remove("Volvo");
        cars.size();
        for (String car : cars) {
            System.out.println(car);
        }
        cars.clear();
    }
}