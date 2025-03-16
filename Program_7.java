// StringBuilder Class in Java

public class Program_7 {
  public static void main(String[] args) {
      StringBuilder sb = new StringBuilder("Hello");
      sb.append(" World");
      System.out.println("After append: " + sb);
      sb.insert(5, ",");
      System.out.println("After insert: " + sb);
      sb.replace(6, 11, "Java");
      System.out.println("After replace: " + sb);
      sb.reverse();
      System.out.println("After reverse: " + sb);
      System.out.println("Length: " + sb.length());
  }
}