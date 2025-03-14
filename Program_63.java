// Frequency of Character in a String in Java

import java.util.HashMap;

public class Program_63 {
  public static void main(String[] args) {
    String str = "Hello World!";
    HashMap<Character, Integer> frequencyMap = new HashMap<>();
    for (char ch : str.toCharArray()) {
      frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
    }
    for (char ch : frequencyMap.keySet()) {
      System.out.println(ch + ": " + frequencyMap.get(ch));
    }
  }
}