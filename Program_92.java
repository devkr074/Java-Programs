import java.util.LinkedHashMap;
import java.util.Map;

public class Program_92 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> capitalCities = new LinkedHashMap<>();
        var capitalCities2 = new LinkedHashMap<String, String>();
        Map<String, String> capitalCities3 = new LinkedHashMap<>();
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
        for (String key : capitalCities.keySet()) {
            System.out.println(key);
        }
        for (String value : capitalCities.values()) {
            System.out.println(value);
        }
        for (String key : capitalCities.keySet()) {
            System.out.println("Key: " + key + ", Value: " + capitalCities.get(key));
        }
        capitalCities.clear();
    }
}