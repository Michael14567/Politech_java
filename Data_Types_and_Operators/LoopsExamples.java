package Data_Types_and_Operators;
public class LoopsExamples {

    public static void main(String[] args) {
        infiniteWhile();
        infiniteDoWhile();
        breakContinueExample();
        forArrayExample();
        forCollectionExample();
        multipleVariablesInFor();
        infiniteWithBreak();
    }

    /**
     * Практика #1: Бесконечный цикл while
     */
    public static void infiniteWhile() {
        System.out.println("Практика #1: Бесконечный цикл while (вывод ограничен)");
        int count = 0;
        while (true) {
            System.out.println("Бесконечный цикл while: count = " + count);
            count++;
            if (count >= 5) break; // Условие выхода
        }
        System.out.println();
    }

    /**
     * Практика #1: Бесконечный цикл do-while
     */
    public static void infiniteDoWhile() {
        System.out.println("Практика #1: Бесконечный цикл do-while (вывод ограничен)");
        int count = 0;
        do {
            System.out.println("Бесконечный цикл do-while: count = " + count);
            count++;
            if (count >= 5) break; // Условие выхода
        } while (true);
        System.out.println();
    }

    /**
     * Практика #2: Использование break и continue
     */
    public static void breakContinueExample() {
        System.out.println("Практика #2: Использование break и continue");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue; // Пропускаем чётные числа
            if (i == 7) break;        // Прерываем цикл при i == 7
            System.out.println("i = " + i);
        }
        System.out.println();
    }

    /**
     * Практика #3: Цикл for для массива
     */
    public static void forArrayExample() {
        System.out.println("Практика #3: Цикл for для массива");
        int[] arr = {1, 3, 5, 7, 9};
        for (int elem : arr) {
            System.out.printf("%d ", elem);
        }
        System.out.println("\n");
    }

    /**
     * Практика #3: Цикл for для коллекции
     */
    public static void forCollectionExample() {
        System.out.println("Практика #3: Цикл for для коллекции");
        java.util.List<String> names = java.util.Arrays.asList("Alice", "Bob", "Charlie");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }

    /**
     * Практика #4: Цикл for с несколькими переменными
     */
    public static void multipleVariablesInFor() {
        System.out.println("Практика #4: Цикл for с несколькими переменными");
        for (int i = 0, j = 10; i <= 10; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }
        System.out.println();
    }

    /**
     * Практика #5: Бесконечный цикл с условием выхода
     */
    public static void infiniteWithBreak() {
        System.out.println("Практика #5: Бесконечный цикл с условием выхода");
        int count = 0;
        while (true) {
            System.out.println("Цикл продолжается: count = " + count);
            count++;
            if (count == 5) {
                System.out.println("Выходим из цикла");
                break;
            }
        }
        System.out.println();
    }
}
