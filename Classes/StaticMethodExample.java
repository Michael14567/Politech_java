package Classes;

public class StaticMethodExample {
    // Статические переменные
    public static int a = 1;
    public static int b;

    // Статический метод
    public static void printVars() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        // 1. Вызов через имя класса
        System.out.println("Вызов через имя класса:");
        StaticMethodExample.printVars();

        // 2. Вызов через объект
        System.out.println("\nВызов через объект:");
        StaticMethodExample obj = new StaticMethodExample();
        obj.printVars(); // Работает, но не рекомендуется

        // Изменение значения статических переменных через объект
        obj.a = 10;
        obj.b = 20;

        // Проверяем, что изменения видны везде
        System.out.println("\nПосле изменения статических переменных через объект:");
        StaticMethodExample.printVars();
    }
}
