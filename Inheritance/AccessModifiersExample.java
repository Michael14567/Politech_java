package Inheritance;

public class AccessModifiersExample {
    // Класс A
    static class A {
        int a1; // default
        public int a2; // public
        protected int a3; // protected
        private int a4; // private

        void method1() {
            System.out.println("Default метод A");
        }

        public void method2() {
            System.out.println("Public метод A");
        }

        protected void method3() {
            System.out.println("Protected метод A");
        }

        private void method4() {
            System.out.println("Private метод A");
        }
    }

    // Класс B наследует A
    static class B extends A {
        void display() {
            System.out.println("a2 (public): " + a2);       // Доступно
            System.out.println("a3 (protected): " + a3);   // Доступно
            method2(); // Public метод доступен
            method3(); // Protected метод доступен

            // Недоступно:
            // System.out.println(a1); // Ошибка: default
            // System.out.println(a4); // Ошибка: private
            // method1(); // Ошибка: default
            // method4(); // Ошибка: private
        }
    }

    // Класс C наследует B
    static class C extends B {
        void displayC() {
            System.out.println("a2 (public): " + a2);       // Доступно
            System.out.println("a3 (protected): " + a3);   // Доступно
            method2(); // Public метод доступен
            method3(); // Protected метод доступен
        }
    }

    public static void main(String[] args) {
        B b = new B();
        System.out.println("Класс B:");
        b.display();

        C c = new C();
        System.out.println("\nКласс C:");
        c.displayC();
    }
}
