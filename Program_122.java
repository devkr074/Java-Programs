import java.util.Set;
import java.util.HashSet;

public class Program_122 {
  public static void main(String[] args) {
    String text = "Hello Java";
    Set<Character> vowels = new HashSet<>();
    for (char v : new char[] { 'a', 'e', 'i', 'o', 'u' }) {
      vowels.add(v);
    }
    int count = 0;
    for (char c : text.toLowerCase().toCharArray()) {
      if (vowels.contains(c)) {
        count++;
      }
    }
    System.out.println("Vowels: " + count);
  }
}