import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Car {
  public String brand;
  public String model;
  public int year;

  public Car(String b, String m, int y) {
    brand = b;
    model = m;
    year = y;
  }
}

class Car2 implements Comparable {
  public String brand;
  public String model;
  public int year;

  public Car2(String b, String m, int y) {
    brand = b;
    model = m;
    year = y;
  }

  public int compareTo(Object obj) {
    Car2 other = (Car2) obj;
    if (year < other.year)
      return -1;
    if (year > other.year)
      return 1;
    return 0;
  }
}

class SortByYear implements Comparator {
  public int compare(Object obj1, Object obj2) {
    Car a = (Car) obj1;
    Car b = (Car) obj2;
    if (a.year < b.year)
      return -1;
    if (a.year > b.year)
      return 1;
    return 0;
  }
}

class SortEvenFirst implements Comparator {
  public int compare(Object obj1, Object obj2) {
    Integer a = (Integer) obj1;
    Integer b = (Integer) obj2;
    boolean aIsEven = (a % 2) == 0;
    boolean bIsEven = (b % 2) == 0;
    if (aIsEven == bIsEven) {
      if (a < b)
        return -1;
      if (a > b)
        return 1;
      return 0;
    } else {
      if (aIsEven) {
        return -1;
      } else {
        return 1;
      }
    }
  }
}

public class Program_101 {
  public static void main(String[] args) {
    ArrayList<Car> myCars = new ArrayList<Car>();
    myCars.add(new Car("BMW", "X5", 1999));
    myCars.add(new Car("Honda", "Accord", 2006));
    myCars.add(new Car("Ford", "Mustang", 1970));
    Comparator myComparator = new SortByYear();
    Collections.sort(myCars, myComparator);
    for (Car c : myCars) {
      System.out.println(c.brand + " " + c.model + " " + c.year);
    }
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(33);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(34);
    myNumbers.add(8);
    myNumbers.add(12);
    Comparator myComparator2 = new SortEvenFirst();
    Collections.sort(myNumbers, myComparator2);
    for (int i : myNumbers) {
      System.out.println(i);
    }
    ArrayList<Car2> myCars2 = new ArrayList<Car2>();
    myCars.add(new Car("BMW", "X5", 1999));
    myCars.add(new Car("Honda", "Accord", 2006));
    myCars.add(new Car("Ford", "Mustang", 1970));
    Collections.sort(myCars2);
    for (Car2 c : myCars2) {
      System.out.println(c.brand + " " + c.model + " " + c.year);
    }
  }
}