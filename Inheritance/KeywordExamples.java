package Inheritance;
public class KeywordExamples {

    // Практика #1: Демонстрация использования super
    static class A {
        int value = 10;

        A() {
            System.out.println("Конструктор класса A");
        }

        void display() {
            System.out.println("Метод класса A");
        }
    }

    static class B extends A {
        int value = 20;

        B() {
            super(); // Обращение к конструктору суперкласса
            System.out.println("Конструктор класса B");
        }

        void display() {
            super.display(); // Обращение к методу суперкласса
            System.out.println("Метод класса B");
        }

        void showValues() {
            System.out.println("Поле из суперкласса A: " + super.value); // Обращение к полю суперкласса
            System.out.println("Поле из текущего класса B: " + this.value);
        }
    }

    // Практика #2: Использование super, если поле и метод определены только в классе A
    static class C extends B {
        void method() {
            System.out.println("Обращение к полю a из суперкласса A: " + super.value);
            super.display(); // Обращение к методу display() из класса A
        }
    }

    // Практика #3: Переписанный код с использованием this()
    static class AWithConstructors {
        int a;
        int b;
        int c;
        int z;

        public AWithConstructors() {
            this(0, 0, 0); // Вызов конструктора с параметрами
            System.out.println("Конструктор без параметров");
        }

        public AWithConstructors(int a) {
            this(a, 0, 0); // Вызов конструктора с параметрами
            System.out.println("Конструктор с одним параметром");
        }

        public AWithConstructors(int a, int b) {
            this(a, b, 0); // Вызов конструктора с параметрами
            System.out.println("Конструктор с двумя параметрами");
        }

        public AWithConstructors(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.z = 1; // Инициализация общего поля
            System.out.println("Конструктор с тремя параметрами");
        }
    }

    public static void main(String[] args) {
        // Практика #1: Использование super
        System.out.println("=== Практика #1 ===");
        B b = new B();
        b.display();
        b.showValues();

        // Практика #2: Использование super в классе C
        System.out.println("\n=== Практика #2 ===");
        C c = new C();
        c.method();

        // Практика #3: Использование this() в конструкторах
        System.out.println("\n=== Практика #3 ===");
        AWithConstructors obj1 = new AWithConstructors();
        AWithConstructors obj2 = new AWithConstructors(10);
        AWithConstructors obj3 = new AWithConstructors(10, 20);
        AWithConstructors obj4 = new AWithConstructors(10, 20, 30);
    }
}
