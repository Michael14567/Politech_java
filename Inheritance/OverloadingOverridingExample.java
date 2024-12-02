package Inheritance;

public class OverloadingOverridingExample {

    // Практика #1: Пример перегруженных методов
    static class Overloading {
        // Метод с одним параметром
        public void display(int number) {
            System.out.println("Число: " + number);
        }

        // Метод с двумя параметрами
        public void display(int number, String text) {
            System.out.println("Число: " + number + ", Текст: " + text);
        }

        // Метод с параметром другого типа
        public void display(String text) {
            System.out.println("Текст: " + text);
        }
    }

    // Практика #2: Пример переопределённого метода
    static class Parent {
        public String greet() {
            return "Привет из суперкласса!";
        }
    }

    static class Child extends Parent {
        @Override
        public String greet() {
            return "Привет из подкласса!";
        }
    }

    // Попытка переопределить метод с несовместимым возвращаемым типом
    // static class InvalidChild extends Parent {
    //     @Override
    //     public int greet() { // Ошибка компиляции: тип возвращаемого значения не совпадает
    //         return 42;
    //     }
    // }

    // Практика #3: Использование @Override для обнаружения ошибок
    static class IncorrectOverrideExample {
        // Ошибка: метод не переопределяет, так как подпись отличается
        // @Override
        // public void display(int num) {
        //     System.out.println("Ошибка: метод не переопределяет метод суперкласса!");
        // }
    }

    public static void main(String[] args) {
        // Практика #1: Перегрузка методов
        System.out.println("=== Перегрузка методов ===");
        Overloading overloading = new Overloading();
        overloading.display(42); // Вызов метода с int
        overloading.display(42, "Пример"); // Вызов метода с int и String
        overloading.display("Просто текст"); // Вызов метода с String

        // Практика #2: Переопределение метода
        System.out.println("\n=== Переопределение методов ===");
        Parent parent = new Parent();
        System.out.println(parent.greet());

        Child child = new Child();
        System.out.println(child.greet());

        // Полиморфизм: вызов переопределённого метода
        Parent poly = new Child();
        System.out.println(poly.greet());

        // Практика #3: Ошибки обнаружены с помощью @Override
        System.out.println("\n=== Использование @Override ===");
        System.out.println("Код с ошибкой был закомментирован, чтобы программа работала.");
    }
}
