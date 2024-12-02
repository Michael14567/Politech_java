package Strings;

import java.util.Date;
import java.util.Formatter;

public class FormatterExample {

    public static void main(String[] args) {
        System.out.println("=== Практика #1: Использование спецификаторов ===");

        // Создаём объект Formatter
        try (Formatter formatter = new Formatter()) {
            // 1. %b - логическое значение
            boolean boolValue = true;
            formatter.format("1. Логическое значение: %b%n", boolValue);

            // 2. %c - символьное представление
            char charValue = 'A';
            formatter.format("2. Символьное представление: %c%n", charValue);

            // 3. %d - десятичное целое
            int intValue = 12345;
            formatter.format("3. Десятичное значение: %d%n", intValue);

            // 4. %f - число с плавающей точкой
            double doubleValue = 123.456;
            formatter.format("4. Число с плавающей точкой: %.2f%n", doubleValue);

            // 5. %% - знак процента
            formatter.format("5. Знак процента: %%n%n");

            // Печатаем отформатированный текст
            System.out.print(formatter);
        }

        System.out.println("\n=== Практика #2: Метод flush() ===");

        // Пример использования flush() с PrintWriter
        try (Formatter formatter = new Formatter(System.out)) {
            formatter.format("Метод flush() гарантирует, что все данные будут записаны в поток вывода.%n");
            formatter.flush(); // Обеспечивает сброс буфера в поток вывода
        }

        System.out.println("\n=== Практика #3: Форматирование времени и даты ===");

        // Создаём объект Date для получения текущей даты и времени
        Date date = new Date();

        try (Formatter formatter = new Formatter()) {
            // 1. %tH - час (00-23)
            formatter.format("1. Часы (24-часовой формат): %tH%n", date);

            // 2. %tM - минуты
            formatter.format("2. Минуты: %tM%n", date);

            // 3. %tB - полное название месяца
            formatter.format("3. Название месяца: %tB%n", date);

            // 4. %tA - полное название дня недели
            formatter.format("4. День недели: %tA%n", date);

            // 5. %tY - год (четырёхзначный формат)
            formatter.format("5. Год: %tY%n", date);

            // Печатаем отформатированную дату и время
            System.out.print(formatter);
        }
    }
}
