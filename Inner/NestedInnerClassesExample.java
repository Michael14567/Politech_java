package Inner;

public class NestedInnerClassesExample {

    // Поля внешнего класса
    private String privateField = "Private Field";
    public String publicField = "Public Field";

    // Практика #1: Различные спецификаторы доступа
    public class PublicInnerClass {
        public void display() {
            System.out.println("Это публичный внутренний класс");
        }
    }

    private class PrivateInnerClass {
        public void display() {
            System.out.println("Это приватный внутренний класс");
        }
    }

    protected class ProtectedInnerClass {
        public void display() {
            System.out.println("Это защищённый внутренний класс");
        }
    }

    class DefaultInnerClass {
        public void display() {
            System.out.println("Это внутренний класс с доступом по умолчанию");
        }
    }

    // Практика #2: Внутренний класс имеет доступ к полям и методам внешнего класса
    public class InnerClassAccess {
        public void accessOuterFields() {
            System.out.println("Доступ к полю внешнего класса (private): " + privateField);
            System.out.println("Доступ к полю внешнего класса (public): " + publicField);
        }
    }

    // Практика #3: Внешний класс имеет доступ к полям и методам внутреннего класса
    public void accessInnerFields() {
        InnerClassWithFields inner = new InnerClassWithFields();
        inner.innerField = "Значение внутреннего поля";
        inner.displayInnerField();
    }

    // Внутренний класс с полем и методом
    public class InnerClassWithFields {
        private String innerField;

        public void displayInnerField() {
            System.out.println("Поле внутреннего класса: " + innerField);
        }
    }

    public static void main(String[] args) {
        // Практика #1: Использование различных спецификаторов доступа
        NestedInnerClassesExample outer = new NestedInnerClassesExample();

        System.out.println("=== Практика #1: Спецификаторы доступа ===");
        PublicInnerClass publicInner = outer.new PublicInnerClass();
        publicInner.display();

        // PrivateInnerClass недоступен из вне, следующий код вызовет ошибку:
        // PrivateInnerClass privateInner = outer.new PrivateInnerClass();

        ProtectedInnerClass protectedInner = outer.new ProtectedInnerClass();
        protectedInner.display();

        DefaultInnerClass defaultInner = outer.new DefaultInnerClass();
        defaultInner.display();

        // Практика #2: Внутренний класс имеет доступ к внешнему классу
        System.out.println("\n=== Практика #2: Доступ внутреннего класса к внешнему ===");
        InnerClassAccess innerAccess = outer.new InnerClassAccess();
        innerAccess.accessOuterFields();

        // Практика #3: Внешний класс имеет доступ к внутреннему классу
        System.out.println("\n=== Практика #3: Доступ внешнего класса к внутреннему ===");
        outer.accessInnerFields();
    }
}
