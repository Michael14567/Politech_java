package Inheritance;

public class StaticPolymorphismExample {

    // Класс A с методом method
    static class A {
        public static void method() {
            System.out.println("Статический метод из класса A");
        }
    }

    // Класс B скрывает (не переопределяет!) метод method класса A
    static class B extends A {
        public static void method() {
            System.out.println("Статический метод из класса B");
        }
    }

    public static void main(String[] args) {
        // Создание объектов классов A и B
        A objA = new A();  // Объект типа A
        B objB = new B();  // Объект типа B
        A objPoly = new B(); // Полиморфизм: ссылка типа A, объект типа B

        // Вызовы статических методов
        System.out.println("=== Вызовы статических методов ===");
        objA.method();    // Вызовет метод класса A
        objB.method();    // Вызовет метод класса B
        objPoly.method(); // Вызовет метод класса A (не учитывает объект B)

        System.out.println("\n=== Объяснение ===");
        System.out.println("Статические методы принадлежат классу, а не объекту.");
        System.out.println("Выбор метода происходит на этапе компиляции, основываясь на типе ссылки.");
        System.out.println("Поэтому objPoly.method() вызывает метод класса A, несмотря на то, что объект типа B.");
    }
}
