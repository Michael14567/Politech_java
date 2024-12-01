// Rectangle и Square не связаны через наследование, а только через общий абстрактный класс Shape.
//Это гарантирует, что каждая фигура ведёт себя так, как ожидается, и никакая логика не ломается.
//Функция printArea корректно работает для всех наследников Shape.
abstract class Shape {
    public abstract double area();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}

public class Basics_of_classes_and_objects {
    public static void printArea(Shape shape) {
        System.out.println("Area: " + shape.area());
    }

    public static void main(String[] args) {
        Shape rect = new Rectangle(3, 4);
        Shape square = new Square(5);

        printArea(rect);    // Вывод: Area: 12
        printArea(square);  // Вывод: Area: 25
    }
}

