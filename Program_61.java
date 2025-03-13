// Reverse a String in Java

public class Program_61 {
  public static void main(String[] args) {
    String str = "Hello World!";
    String reversedStr = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      reversedStr += str.charAt(i);
    }
    System.out.println("Reversed string: " + reversedStr);
  }
}