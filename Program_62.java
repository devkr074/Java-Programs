// Palindrome String Check in Java

public class Program_62 {
  public static void main(String[] args) {
    String str = "madam";
    String reversedStr = new StringBuilder(str).reverse().toString();
    if (str.equals(reversedStr)) {
      System.out.println(str + " is a palindrome.");
    } else {
      System.out.println(str + " is not a palindrome.");
    }
  }
}