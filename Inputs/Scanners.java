package Inputs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanners {

    public static void main(String[] args) {
        System.out.println("=== Чтение данных из файла с помощью Scanner ===");

        // Имя текстового файла
        String fileName = "input.txt";

        // Попытка открыть файл и прочитать его содержимое
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            // Чтение строк из файла
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println("Прочитано из файла: " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}
