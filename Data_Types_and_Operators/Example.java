/**
 *
 * @author Dnec
 * @version 1.0
 * @since 2024-12-02
 */
package Data_Types_and_Operators;
public class Example {

    /**
     * Метод вычисляет сумму двух чисел.
     *
     * @param a первое число
     * @param b второе число
     * @return сумма чисел a и b
     */
    public int sum(int a, int b) {
        return a + b;
    }

    /**
     * Главный метод программы.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Example example = new Example();
        int result = example.sum(5, 10);
        System.out.println("Сумма: " + result);
    }
}
