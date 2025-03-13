// Count Vowels in an String in Java

public class Program_60 {
  public static void main(String[] args) {
    String str = "Hello World!";
    int vowelCount = 0;
    String vowels = "aeiouAEIOU";
    for (int i = 0; i < str.length(); i++) {
      if (vowels.indexOf(str.charAt(i)) != -1) {
        vowelCount++;
      }
    }
    System.out.println("Number of vowels: " + vowelCount);
  }
}