package Exceptions;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        System.out.println("=== Начало программы ===");

        try {
            // Генерация первого исключения, которое будет перехвачено
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Исключение перехвачено: " + e.getMessage());
        }

        // Генерация второго исключения, которое не будет обработано
        String str = null;
        System.out.println("Длина строки: " + str.length()); // NullPointerException

        // Этот код не выполнится из-за необработанного исключения
        System.out.println("=== Конец программы ===");
    }
}
