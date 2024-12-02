package Classes and Methods.another;

package another;

import demo.Example;

// Подкласс Example из другого пакета
public class SubClass extends Example {
    public void accessProtectedMembers() {
        // Доступ к protected членам родительского класса
        System.out.println("Protected field from parent: " + protectedField);
        protectedMethod();

        // Доступ к public членам родительского класса
        System.out.println("Public field from parent: " + publicField);
        publicMethod();

        // Доступ к default и private членам родительского класса невозможен:
        // System.out.println(defaultField); // Ошибка компиляции
        // defaultMethod(); // Ошибка компиляции
        // System.out.println(privateField); // Ошибка компиляции
        // privateMethod(); // Ошибка компиляции
    }
}
