package Inputs;

import java.io.*;

public class IOStreamsExample {

    public static void main(String[] args) {
        System.out.println("=== Практика #1: Использование InputStream ===");
        // Чтение данных из файла с использованием InputStream
        try (InputStream input = new FileInputStream("input.txt")) {
            int data;
            while ((data = input.read()) != -1) { // Читаем байты по одному
                System.out.print((char) data); // Преобразуем байт в символ
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении: " + e.getMessage());
        }

        System.out.println("\n\n=== Практика #2: Использование OutputStream ===");
        // Запись данных в файл с использованием OutputStream
        try (OutputStream output = new FileOutputStream("output.txt")) {
            String text = "Пример работы с OutputStream.";
            for (char c : text.toCharArray()) {
                output.write(c); // Записываем каждый символ как байт
            }
            System.out.println("Текст успешно записан в output.txt");
        } catch (IOException e) {
            System.out.println("Ошибка при записи: " + e.getMessage());
        }

        System.out.println("\n=== Практика #3: Зачем нужны Reader и Writer? ===");
        System.out.println("Reader и Writer используются для работы с символьными потоками.");
        System.out.println("Они упрощают работу с текстовыми данными, где важна кодировка символов.");
        System.out.println("InputStream/OutputStream работают с байтами, а Reader/Writer — с символами.");

        System.out.println("\n=== Практика #4: Использование AutoCloseable ===");
        // Использование AutoCloseable для автоматического закрытия ресурсов
        try (CustomResource resource = new CustomResource()) {
            resource.doWork();
        } catch (Exception e) {
            System.out.println("Ошибка при работе с ресурсом: " + e.getMessage());
        }
    }
}

// Кастомный ресурс для демонстрации AutoCloseable
class CustomResource implements AutoCloseable {
    public void doWork() {
        System.out.println("Работа с ресурсом...");
    }

    @Override
    public void close() {
        System.out.println("Ресурс успешно закрыт.");
    }
}
