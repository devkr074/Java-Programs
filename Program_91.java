import java.util.Map;
import java.util.TreeMap;

public class Program_91 {
    public static void main(String[] args) {
        TreeMap<String, String> capitalCities = new TreeMap<>();
        var capitalCities2 = new TreeMap<String, String>();
        Map<String, String> capitalCities3 = new TreeMap<>();
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
    }
}