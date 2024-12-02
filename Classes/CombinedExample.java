package Classes;

class Calculator {
    // Перегрузка метода add
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b; // Конкатенация строк
    }
}

class AdvancedCalculator extends Calculator {
    // Переопределение метода add для int
    @Override
    public int add(int a, int b) {
        System.out.println("AdvancedCalculator adds integers:");
        return super.add(a, b); // Использует базовую реализацию
    }

    // Новый метод, не связанный с перегрузкой
    public int multiply(int a, int b) {
        return a * b;
    }
}

public class CombinedExample {
    public static void main(String[] args) {
        Calculator basicCalc = new Calculator();
        AdvancedCalculator advCalc = new AdvancedCalculator();

        // Перегрузка
        System.out.println("Basic add (int): " + basicCalc.add(2, 3));       // 5
        System.out.println("Basic add (double): " + basicCalc.add(2.5, 3.5));// 6.0
        System.out.println("Basic add (String): " + basicCalc.add("Hello", " World!"));

        // Переопределение
        System.out.println("Advanced add (int): " + advCalc.add(5, 7));      // AdvancedCalculator adds integers: 12

        // Новый метод
        System.out.println("Multiply: " + advCalc.multiply(3, 4));          // 12
    }
}
