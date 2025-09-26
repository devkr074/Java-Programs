import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program_84 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        var cars2 = new ArrayList<String>();
        List<String> cars3 = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        System.out.println(cars);
        cars.add(0, "Mazda");
        System.out.println(cars);
        cars.get(0);
        cars.set(0, "Opel");
        cars.remove(0);
        cars.size();
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        for (String i : cars) {
            System.out.println(i);
        }
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }
        Collections.sort(cars);
        for (String i : cars) {
            System.out.println(i);
        }
        Collections.sort(myNumbers);
        for (int i : myNumbers) {
            System.out.println(i);
        }
        cars.clear();
    }
}