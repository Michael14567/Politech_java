
public class WrapperClasses {
    public static void main(String[] args) {
        practice1();
        practice2();
        practice3();
        practice4();
    }

    /**
     * Практика #1: Примеры использования метода decode().
     */
    public static void practice1() {
        System.out.println("Практика #1: Примеры использования метода decode()");

        Integer decimal = Integer.decode("123");
        Integer hex = Integer.decode("0x7B");
        Integer octal = Integer.decode("0173");

        System.out.println("Decimal: " + decimal);        // 123
        System.out.println("Hexadecimal: " + hex);       // 123
        System.out.println("Octal: " + octal);           // 123
        System.out.println();
    }

    /**
     * Практика #2: Способы создания экземпляра класса Boolean.
     */
    public static void practice2() {
        System.out.println("Практика #2: Способы создания экземпляра класса Boolean");

        Boolean bool1 = true; // Автоупаковка
        Boolean bool2 = Boolean.valueOf(true);
        Boolean bool3 = Boolean.valueOf("true");
        Boolean bool4 = Boolean.valueOf("false");
        Boolean bool5 = Boolean.valueOf("invalid"); // false, так как строка не "true"

        System.out.println("bool1: " + bool1);
        System.out.println("bool2: " + bool2);
        System.out.println("bool3: " + bool3);
        System.out.println("bool4: " + bool4);
        System.out.println("bool5: " + bool5);
        System.out.println();
    }

    /**
     * Практика #3: Исключение NullPointerException при автоупаковке/автораспаковке.
     */
    public static void practice3() {
        System.out.println("Практика #3: Исключение NullPointerException при автоупаковке/автораспаковке");

        Integer nullInteger = null;
        try {
            int value = nullInteger; // Попытка автораспаковки
        } catch (NullPointerException e) {
            System.out.println("NullPointerException пойман: " + e.getMessage());
        }
        System.out.println();
    }

    /**
     * Практика #4: Результаты выполнения кода и объяснение.
     */
    public static void practice4() {
        System.out.println("Практика #4: Результаты выполнения кода и объяснение");

        int i1 = 128;
        Integer a1 = i1;
        Integer b1 = i1;
        System.out.println("a1 == i1: " + (a1 == i1));                     // true
        System.out.println("b1 == i1: " + (b1 == i1));                     // true
        System.out.println("a1 == b1: " + (a1 == b1));                     // false
        System.out.println("a1.equals(i1): " + a1.equals(i1));             // true
        System.out.println("b1.equals(i1): " + b1.equals(i1));             // true
        System.out.println("a1.equals(b1): " + a1.equals(b1));             // true

        int i2 = 127;
        Integer a2 = i2;
        Integer b2 = i2;
        System.out.println("a2 == i2: " + (a2 == i2));                     // true
        System.out.println("b2 == i2: " + (b2 == i2));                     // true
        System.out.println("a2 == b2: " + (a2 == b2));                     // true
        System.out.println("a2.equals(i2): " + a2.equals(i2));             // true
        System.out.println("b2.equals(i2): " + b2.equals(i2));             // true
        System.out.println("a2.equals(b2): " + a2.equals(b2));             // true

        System.out.println("\nОбъяснение:");
        System.out.println("Для значений от -128 до 127 используется IntegerCache, который кэширует объекты.");
        System.out.println("Поэтому a2 и b2 ссылаются на один и тот же объект.");
        System.out.println("Для значений за пределами этого диапазона создаются новые объекты, поэтому ссылки будут разными.");
    }
}
