import java.util.HashMap;

public class Program_130 {
  public static void main(String[] args) {
    String text = "banana";
    HashMap<Character, Integer> freq = new HashMap<>();
    for (char c : text.toCharArray()) {
      freq.put(c, freq.getOrDefault(c, 0) + 1);
    }
    System.out.println(freq);
  }
}