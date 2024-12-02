package Exceptions;

// Собственное исключение
class MyFirstException extends Exception {

    // Конструктор по умолчанию
    public MyFirstException() {
        super("Произошло пользовательское исключение MyFirstException");
    }

    // Конструктор с сообщением
    public MyFirstException(String message) {
        super(message);
    }

    // Конструктор с сообщением и причиной
    public MyFirstException(String message, Throwable cause) {
        super(message, cause);
    }
}

// Класс с примером использования пользовательского исключения
public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            // Генерация пользовательского исключения с сообщением
            throwExceptionExample(true);
        } catch (MyFirstException e) {
            System.out.println("Поймано пользовательское исключение: " + e.getMessage());
        }

        try {
            // Генерация пользовательского исключения с причиной
            throwExceptionExample(false);
        } catch (MyFirstException e) {
            System.out.println("Поймано исключение с причиной:");
            e.printStackTrace();
        }
    }

    // Метод, выбрасывающий пользовательское исключение
    public static void throwExceptionExample(boolean simple) throws MyFirstException {
        if (simple) {
            throw new MyFirstException("Это простое исключение.");
        } else {
            Throwable cause = new IllegalArgumentException("Причина исключения: некорректный аргумент.");
            throw new MyFirstException("Исключение с причиной.", cause);
        }
    }
}
