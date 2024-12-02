package Exceptions;

// Демонстрация обработки нескольких исключений
public class MultiCatchExample {

    public static void main(String[] args) {
        System.out.println("=== Практика #1: Обработка нескольких исключений ===");

        // Ситуация 1: Обработка нескольких исключений идентичным образом
        try {
            int[] numbers = {1, 2, 3};
            int result = 10 / 0; // ArithmeticException
            System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Обработано исключение: " + e.getClass().getSimpleName());
        }

        // Ситуация 2: Исключения в иерархии Ex1 <|-- Ex2 <|-- Ex3
        try {
            throw new Ex3("Исключение Ex3");
        } catch (Ex3 e) {
            System.out.println("Поймано Ex3: " + e.getMessage());
        } catch (Ex2 e) {
            System.out.println("Поймано Ex2: " + e.getMessage());
        } catch (Ex1 e) {
            System.out.println("Поймано Ex1: " + e.getMessage());
        }

        System.out.println("\n=== Практика #2: Использование final в блоке catch ===");
        try {
            int result = 10 / 0; // ArithmeticException
        } catch (final Exception e) {
            System.out.println("Исключение с final: " + e.getMessage());
            // e = new Exception(); // Ошибка компиляции: переменная final
        }
    }
}

// Создание пользовательской иерархии исключений
class Ex1 extends Exception {
    public Ex1(String message) {
        super(message);
    }
}

class Ex2 extends Ex1 {
    public Ex2(String message) {
        super(message);
    }
}

class Ex3 extends Ex2 {
    public Ex3(String message) {
        super(message);
    }
}
