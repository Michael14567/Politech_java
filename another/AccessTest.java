package Classes and Methods.another;

package another;

public class AccessTest {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.accessProtectedMembers();

        // Доступ к protected полям через экземпляр невозможен:
        // System.out.println(subClass.protectedField); // Ошибка компиляции
        // subClass.protectedMethod(); // Ошибка компиляции
    }
}
