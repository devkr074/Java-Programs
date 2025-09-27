import java.util.HashMap;
import java.util.Map;

public class Program_90 {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        var capitalCities2 = new HashMap<String, String>();
        Map<String, String> capitalCities3 = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        capitalCities.get("England");
        capitalCities.remove("England");
        capitalCities.size();
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }
        capitalCities.clear();
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);
        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }
    }
}