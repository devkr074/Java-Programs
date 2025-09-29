class Box<T> {
  T value;

  void set(T value) {
    this.value = value;
  }

  T get() {
    return value;
  }
}

class Stats<T extends Number> {
  T[] nums;

  Stats(T[] nums) {
    this.nums = nums;
  }

  double average() {
    double sum = 0;
    for (T num : nums) {
      sum += num.doubleValue();
    }
    return sum / nums.length;
  }
}

public class Program_96 {
  public static <T> void printArray(T[] array) {
    for (T item : array) {
      System.out.println(item);
    }
  }

  public static void main(String[] args) {
    String[] names = { "Jenny", "Liam" };
    Integer[] numbers = { 1, 2, 3 };
    printArray(names);
    printArray(numbers);
    Box<String> stringBox = new Box<>();
    stringBox.set("Hello");
    System.out.println("Value: " + stringBox.get());
    Box<Integer> intBox = new Box<>();
    intBox.set(50);
    System.out.println("Value: " + intBox.get());
    Integer[] intNums = { 10, 20, 30, 40 };
    Stats<Integer> intStats = new Stats<>(intNums);
    System.out.println("Integer average: " + intStats.average());
    Double[] doubleNums = { 1.5, 2.5, 3.5 };
    Stats<Double> doubleStats = new Stats<>(doubleNums);
    System.out.println("Double average: " + doubleStats.average());
  }
}