package Functional_Interfaces;

public class InterfaceMethodsExample {

    // Интерфейс с неабстрактным (default) методом и статическим методом
    interface MyInterface {
        // Абстрактный метод
        void abstractMethod();

        // Неабстрактный (default) метод
        default void defaultMethod() {
            System.out.println("Вызов default-метода интерфейса MyInterface");
        }

        // Статический метод
        static void staticMethod() {
            System.out.println("Вызов static-метода интерфейса MyInterface");
        }
    }

    // Класс, реализующий интерфейс
    static class MyClass implements MyInterface {
        @Override
        public void abstractMethod() {
            System.out.println("Реализация абстрактного метода в классе MyClass");
        }

        // Переопределение default-метода
        @Override
        public void defaultMethod() {
            System.out.println("Переопределённый default-метод в классе MyClass");
        }
    }

    // Практика #2: Интерфейсы с одинаковыми default-методами
    interface InterfaceA {
        default void commonMethod() {
            System.out.println("Default-метод из InterfaceA");
        }
    }

    interface InterfaceB {
        default void commonMethod() {
            System.out.println("Default-метод из InterfaceB");
        }
    }

    static class MultiInterfaceClass implements InterfaceA, InterfaceB {
        @Override
        public void commonMethod() {
            // Явное разрешение конфликта
            InterfaceA.super.commonMethod();
            InterfaceB.super.commonMethod();
            System.out.println("Объединение логики двух интерфейсов в классе MultiInterfaceClass");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Практика #1: Методы интерфейса ===");

        // Создаём объект класса MyClass
        MyInterface myObject = new MyClass();

        // Вызов абстрактного метода
        myObject.abstractMethod();

        // Вызов default-метода
        myObject.defaultMethod();

        // Вызов static-метода
        MyInterface.staticMethod();

        System.out.println("\n=== Практика #2: Конфликт default-методов ===");

        // Создаём объект класса MultiInterfaceClass
        MultiInterfaceClass multiObject = new MultiInterfaceClass();

        // Вызов разрешённого метода
        multiObject.commonMethod();
    }
}
