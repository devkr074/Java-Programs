import java.util.Arrays;

public class Program_133 {
  public static void main(String[] args) {
    String[] cars = { "Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi" };
    Arrays.sort(cars);
    for (String i : cars) {
      System.out.println(i);
    }
  }
}