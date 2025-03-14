// Capitalize First Letter in Java

public class Program_64 {
  public static void main(String[] args) {
    String str = "hello world!";
    String[] words = str.split(" ");
    String capitalizedStr = "";
    for (String word : words) {
      capitalizedStr += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
    }
    System.out.println("Capitalized string: " + capitalizedStr.trim());
  }
}