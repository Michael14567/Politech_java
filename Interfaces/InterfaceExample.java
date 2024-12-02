
package Interfaces;


public interface PublicInterface {
    void publicMethod();
}

// Интерфейс без модификатора
interface PackagePrivateInterface {
    void packagePrivateMethod();
}

// Класс, реализующий оба интерфейса
public class InterfaceExample implements PublicInterface, PackagePrivateInterface {
    @Override
    public void publicMethod() {
        System.out.println("Реализация метода из PublicInterface");
    }

    @Override
    public void packagePrivateMethod() {
        System.out.println("Реализация метода из PackagePrivateInterface");
    }

    public static void main(String[] args) {
        InterfaceExample example = new InterfaceExample();
        example.publicMethod();
        example.packagePrivateMethod();
    }
}
