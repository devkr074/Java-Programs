// Vowel or Consonant in Java

import java.util.Scanner;

public class Program_23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a character: ");
    char ch = sc.next().charAt(0);
    switch (ch) {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
      case 'A':
      case 'E':
      case 'I':
      case 'O':
      case 'U':
        System.out.println(ch + " is a vowel.");
        break;
      default:
        System.out.println(ch + " is a consonant.");
    }
    sc.close();
  }
}