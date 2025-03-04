// Shape Class Hierarchy in Java

public class Program_34 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Area of Rectangle: " + rectangle.area());
        Circle circle = new Circle(4);
        System.out.println("Area of Circle: " + circle.area());
    }
}

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