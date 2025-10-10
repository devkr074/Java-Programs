import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Program_139 {
  public static void main(String[] args) {
    Integer[] numbers = { 1, 2, 2, 3, 4, 4, 5 };
    Set<Integer> unique = new HashSet<>(Arrays.asList(numbers));
    System.out.println(unique);
  }
}