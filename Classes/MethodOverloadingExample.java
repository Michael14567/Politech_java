package Classes;

public class MethodOverloadingExample {
    // Перегрузка метода с разными параметрами
    public void printMessage(String message) {
        System.out.println("Message: " + message);
    }

    public void printMessage(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Message: " + message);
        }
    }

    public void printMessage(int number) {
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        MethodOverloadingExample example = new MethodOverloadingExample();

        example.printMessage("Hello, World!");             // Вызывает метод с одним параметром
        example.printMessage("Repeat this", 3);            // Вызывает метод с двумя параметрами
        example.printMessage(42);                          // Вызывает метод с параметром int
    }
}
