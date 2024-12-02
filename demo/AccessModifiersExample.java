// Файл: AccessModifiersExample.java
package demo;

// Класс AccessModifiers находится в пакете demo
public class AccessModifiersExample {
    public static void main(String[] args) {
        Example example = new Example();

        // Доступ к public членам класса
        System.out.println("Public field: " + example.publicField);
        example.publicMethod();

        // Доступ к protected членам класса (в том же пакете)
        System.out.println("Protected field: " + example.protectedField);
        example.protectedMethod();

        // Доступ к полю и методу без спецификатора (по умолчанию, package-private)
        System.out.println("Default field: " + example.defaultField);
        example.defaultMethod();

        // Доступ к private полю и методу невозможен:
        // example.privateField; // Ошибка компиляции
        // example.privateMethod(); // Ошибка компиляции
    }
}

// Класс Example демонстрирует работу различных спецификаторов
class Example {
    // Поле и метод с модификатором public
    public String publicField = "Я доступен всем!";
    public void publicMethod() {
        System.out.println("Это public метод, доступный всем.");
    }

    // Поле и метод с модификатором protected
    protected String protectedField = "Я доступен в пакете demo и в подклассах.";
    protected void protectedMethod() {
        System.out.println("Это protected метод.");
    }

    // Поле и метод без модификатора (по умолчанию, package-private)
    String defaultField = "Я доступен только в пакете demo.";
    void defaultMethod() {
        System.out.println("Это метод с доступом по умолчанию.");
    }

    // Поле и метод с модификатором private
    private String privateField = "Я доступен только внутри класса Example.";
    private void privateMethod() {
        System.out.println("Это private метод.");
    }
}
