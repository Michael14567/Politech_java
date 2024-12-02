public class OperatorsPractice {
    public static void main(String[] args) {
        // Практика #1: Примеры использования операторов

        // 1. Операторы + и += (конкатенация строк и сложение)
        String greeting = "Привет";
        greeting += ", мир!";
        System.out.println("Конкатенация строк: " + greeting);

        int a = 10, b = 20;
        int sum = a + b;
        System.out.println("Сложение целых чисел: " + sum);

        // 2. Операторы == и != (сравнение)
        System.out.println("10 == 20: " + (a == b));
        System.out.println("10 != 20: " + (a != b));
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println("Сравнение строк (по содержимому): " + str1.equals(str2));

        // 3. Оператор присваивания =
        int x = 42;
        System.out.println("Присваивание: x = " + x);

        // 4. Логические операторы &&, ||, !
        boolean cond1 = true, cond2 = false;
        System.out.println("Логическое И (&&): " + (cond1 && cond2));
        System.out.println("Логическое ИЛИ (||): " + (cond1 || cond2));
        System.out.println("Логическое НЕ (!): " + !cond1);

        // 5. Операторы сравнения >, <, >=, <=
        System.out.println("10 > 20: " + (a > b));
        System.out.println("10 <= 20: " + (a <= b));

        // 6. Побитовые операторы &, |, ^, ~
        int bitA = 0b1100; // 12 в двоичной системе
        int bitB = 0b1010; // 10 в двоичной системе
        System.out.println("Побитовое И (&): " + (bitA & bitB));
        System.out.println("Побитовое ИЛИ (|): " + (bitA | bitB));
        System.out.println("Побитовое исключающее ИЛИ (^): " + (bitA ^ bitB));
        System.out.println("Побитовое НЕ (~): " + (~bitA));

        // 7. Сдвиги >>, >>>, <<
        int shiftVal = 8;
        System.out.println("Сдвиг вправо (>>): " + (shiftVal >> 2));
        System.out.println("Беззнаковый сдвиг вправо (>>>): " + (shiftVal >>> 2));
        System.out.println("Сдвиг влево (<<): " + (shiftVal << 2));

        // 8. Арифметические операторы *, /, %, -, +
        System.out.println("Умножение: " + (a * b));
        System.out.println("Деление: " + (b / a));
        System.out.println("Остаток: " + (b % a));
        System.out.println("Вычитание: " + (b - a));

        // 9. Префиксная и постфиксная форма ++, --
        int count = 5;
        System.out.println("Постфиксная форма (count++): " + (count++));
        System.out.println("После постфикса: " + count);
        System.out.println("Префиксная форма (++count): " + (++count));

        System.out.println("Постфиксная форма (count--): " + (count--));
        System.out.println("После постфикса: " + count);
        System.out.println("Префиксная форма (--count): " + (--count));

        // 10. Тенарный оператор (?:)
        int age = 18;
        String result = (age >= 18) ? "Совершеннолетний" : "Несовершеннолетний";
        System.out.println("Тенарный оператор: " + result);

        // Практика #2: Примеры с оператором instanceof

        // Примеры работы
        String text = "Hello";
        Integer number = 123;

        System.out.println("text instanceof String: " + (text instanceof String));
        System.out.println("number instanceof Integer: " + (number instanceof Integer));

        // null-объект
        String nullString = null;
        System.out.println("null instanceof String: " + (nullString instanceof String)); // false

        // Пример с наследованием
        Object obj = 42; // Автоупаковка, неявное создание объекта Integer
        System.out.println("obj instanceof Integer: " + (obj instanceof Integer)); // true
        System.out.println("obj instanceof Object: " + (obj instanceof Object));  // true
        System.out.println("obj instanceof String: " + (obj instanceof String));  // false

    }
}
