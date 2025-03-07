// Abstraction in Java (Shape Class)

abstract class Shape {
  abstract double area();

  void displayShape() {
    System.out.println("This is a shape.");
  }
}

class Rectangle extends Shape {
  double length;
  double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  @Override
  double area() {
    return length * width;
  }
}

class Circle extends Shape {
  double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  double area() {
    return Math.PI * radius * radius;
  }
}

public class Program_42 {
  public static void main(String[] args) {
    Shape myRectangle = new Rectangle(5, 3);
    Shape myCircle = new Circle(4);
    myRectangle.displayShape();
    System.out.println("Area of Rectangle: " + myRectangle.area());
    myCircle.displayShape();
    System.out.println("Area of Circle: " + myCircle.area());
  }
}