package Inheritance;

public class FinalExamples {

    // Класс с final-методом
    static class Parent {
        public final void display() {
            System.out.println("Это final метод суперкласса.");
        }
    }

    // Подкласс, который пытается переопределить final-метод
    static class Child extends Parent {
        // Попытка переопределить final-метод вызовет ошибку
        // @Override
        // public void display() {
        //     System.out.println("Переопределение запрещено.");
        // }
    }

    // Final класс
    public final static class FinalClass {
        public void show() {
            System.out.println("Это метод final-класса.");
        }
    }

    // Подкласс от FinalClass невозможен
    // static class SubClass extends FinalClass {
    //     // Ошибка компиляции: нельзя наследовать final класс
    // }

    public static void main(String[] args) {
        // Демонстрация использования final-метода
        Parent parent = new Parent();
        parent.display();

        Child child = new Child();
        child.display(); // Вызывает метод из Parent, так как переопределение запрещено


        FinalClass finalClass = new FinalClass();
        finalClass.show();

        // SubClass subClass = new SubClass(); // Ошибка компиляции
    }
}
