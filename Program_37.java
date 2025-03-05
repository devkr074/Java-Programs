// Polymorphism in Java (Shape Hierarchy)

abstract class Shape {
  abstract double area();
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

public class Program_37 {
  public static void main(String[] args) {
    Shape myRectangle = new Rectangle(5, 3);
    Shape myCircle = new Circle(4);
    System.out.println("Area of Rectangle: " + myRectangle.area());
    System.out.println("Area of Circle: " + myCircle.area());
  }
}