package Strings;

import java.util.StringJoiner;

public class StringExamples {

    public static void main(String[] args) {
        System.out.println("=== Практика #1: Методы класса String ===");

        // Пример строки
        String str = "Hello, World!";

        // 1. length(): возвращает длину строки
        System.out.println("1. Длина строки: " + str.length());

        // 2. charAt(): возвращает символ в указанной позиции
        System.out.println("2. Символ на позиции 7: " + str.charAt(7));

        // 3. substring(): возвращает подстроку
        System.out.println("3. Подстрока (с 7 по конец): " + str.substring(7));

        // 4. contains(): проверяет наличие подстроки
        System.out.println("4. Содержит ли 'World': " + str.contains("World"));

        // 5. replace(): заменяет все вхождения одной строки на другую
        System.out.println("5. Замена 'World' на 'Java': " + str.replace("World", "Java"));

        // 6. toUpperCase(): переводит строку в верхний регистр
        System.out.println("6. В верхнем регистре: " + str.toUpperCase());

        // 7. toLowerCase(): переводит строку в нижний регистр
        System.out.println("7. В нижнем регистре: " + str.toLowerCase());

        // 8. startsWith(): проверяет, начинается ли строка с определённой подстроки
        System.out.println("8. Начинается с 'Hello': " + str.startsWith("Hello"));

        // 9. endsWith(): проверяет, заканчивается ли строка определённой подстрокой
        System.out.println("9. Заканчивается на '!': " + str.endsWith("!"));

        // 10. trim(): удаляет пробелы в начале и конце строки
        String strWithSpaces = "   Hello, Java!   ";
        System.out.println("10. После trim(): '" + strWithSpaces.trim() + "'");

        System.out.println("\n=== Практика #2: Использование StringJoiner ===");

        // StringJoiner для объединения строк с разделителем
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        joiner.add("Alice").add("Bob").add("Charlie");
        System.out.println("StringJoiner: " + joiner);

        // Использование String.join()
        String joinedString = String.join(" | ", "Apple", "Banana", "Cherry");
        System.out.println("String.join(): " + joinedString);

        System.out.println("\n=== Практика #3: Три двойные кавычки ===");
        System.out.println("В Java три двойные кавычки (\"\"\") не используются. " +
                           "Вместо этого строки задаются в одинарных или двойных кавычках, " +
                           "а многострочные строки могут быть сформированы с помощью конкатенации или Text Blocks (Java 13+).");
    }
}
