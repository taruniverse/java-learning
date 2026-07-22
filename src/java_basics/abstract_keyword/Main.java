package java_basics.abstract_keyword;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(5);
        System.out.println("Area: " + shape.area());
    }
}

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    private final int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

