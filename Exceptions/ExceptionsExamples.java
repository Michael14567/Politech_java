package Exceptions;

public class ExceptionsExamples {

    public static void main(String[] args) {
        System.out.println("=== Пример 1: ArithmeticException ===");
        try {
            int result = 10 / 0; // Деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException пойман: " + e.getMessage());
        }

        System.out.println("\n=== Пример 2: ArrayIndexOutOfBoundsException ===");
        try {
            int[] numbers = {1, 2, 3};
            int invalidIndex = numbers[5]; // Несуществующий индекс
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException пойман: " + e.getMessage());
        }

        System.out.println("\n=== Пример 3: IllegalArgumentException ===");
        try {
            setAge(-5); // Некорректный возраст
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException пойман: " + e.getMessage());
        }

        System.out.println("\n=== Пример 4: ClassCastException ===");
        try {
            Object str = "This is a string";
            Integer num = (Integer) str; // Некорректное приведение типов
        } catch (ClassCastException e) {
            System.out.println("ClassCastException пойман: " + e.getMessage());
        }

        System.out.println("\n=== Пример 5: NullPointerException ===");
        try {
            String str = null;
            int length = str.length(); // Вызов метода на null-объекте
        } catch (NullPointerException e) {
            System.out.println("NullPointerException пойман: " + e.getMessage());
        }
    }

    // Метод для примера с IllegalArgumentException
    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным.");
        }
    }
}
