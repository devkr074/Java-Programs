// Class in Java (Rectangle Class)

public class Program_28 {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(5, 3);
    System.out.println("Area: " + rectangle.calculateArea());
    System.out.println("Perimeter: " + rectangle.calculatePerimeter());
  }
}

class Rectangle {
  double length;
  double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  double calculateArea() {
    return length * width;
  }

  double calculatePerimeter() {
    return 2 * (length + width);
  }
}