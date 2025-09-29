import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Program_94 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Liam");
        names.add("Jenny");
        names.add("Kasper");
        names.add("Angie");
        Collections.sort(names);
        int index = Collections.binarySearch(names, "Angie");
        System.out.println("Angie is at index: " + index);
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(7);
        numbers.add(3);
        numbers.add(9);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        for (String c : colors) {
            System.out.println(c);
        }
        Iterator<String> it = colors.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Max: " + Collections.max(numbers));
        System.out.println("Min: " + Collections.min(numbers));
        ArrayList<String> cards = new ArrayList<>();
        cards.add("Ace");
        cards.add("King");
        cards.add("Queen");
        cards.add("Jack");
        Collections.shuffle(cards);
        System.out.println(cards);
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Mango");
        int count = Collections.frequency(fruits, "Banana");
        System.out.println("Banana appears: " + count + " times");
        Collections.swap(fruits, 0, 2);
        System.out.println(fruits);
    }
}