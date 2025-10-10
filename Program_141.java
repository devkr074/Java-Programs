import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program_141 {
  public static void main(String[] args) {
    String[] fruits = { "Apple", "Banana", "Cherry", "Mango" };
    List<String> list = Arrays.asList(fruits);
    Collections.shuffle(list);
    System.out.println(list);
  }
}