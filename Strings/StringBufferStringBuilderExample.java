package Strings;

public class StringBufferStringBuilderExample {

    public static void main(String[] args) {
        System.out.println("=== Практика #1: Методы классов StringBuffer и StringBuilder ===");

        // Демонстрация методов StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // 1. append(): добавляет строку в конец
        sb.append(", World!");
        System.out.println("1. append(): " + sb);

        // 2. insert(): вставляет строку по указанному индексу
        sb.insert(5, ",");
        System.out.println("2. insert(): " + sb);

        // 3. delete(): удаляет подстроку
        sb.delete(5, 6);
        System.out.println("3. delete(): " + sb);

        // 4. replace(): заменяет часть строки
        sb.replace(7, 12, "Java");
        System.out.println("4. replace(): " + sb);

        // 5. reverse(): переворачивает строку
        sb.reverse();
        System.out.println("5. reverse(): " + sb);
        sb.reverse(); // Вернём строку обратно

        // 6. capacity(): возвращает текущую ёмкость буфера
        System.out.println("6. capacity(): " + sb.capacity());

        // 7. ensureCapacity(): увеличивает ёмкость буфера
        sb.ensureCapacity(50);
        System.out.println("7. ensureCapacity(): " + sb.capacity());

        // 8. setLength(): задаёт длину строки
        sb.setLength(5);
        System.out.println("8. setLength(): " + sb);

        // 9. charAt(): возвращает символ по индексу
        System.out.println("9. charAt(1): " + sb.charAt(1));

        // 10. substring(): возвращает подстроку
        System.out.println("10. substring(1, 4): " + sb.substring(1, 4));

        System.out.println("\n=== Практика #2: Преобразование между String, StringBuffer и StringBuilder ===");

        // Преобразование String -> StringBuffer
        String str = "Convert me!";
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println("String -> StringBuffer: " + stringBuffer);

        // Преобразование String -> StringBuilder
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println("String -> StringBuilder: " + stringBuilder);

        // Преобразование StringBuffer -> String
        String stringFromBuffer = stringBuffer.toString();
        System.out.println("StringBuffer -> String: " + stringFromBuffer);

        // Преобразование StringBuilder -> String
        String stringFromBuilder = stringBuilder.toString();
        System.out.println("StringBuilder -> String: " + stringFromBuilder);

        // Преобразование StringBuffer -> StringBuilder
        StringBuilder builderFromBuffer = new StringBuilder(stringBuffer);
        System.out.println("StringBuffer -> StringBuilder: " + builderFromBuffer);

        // Преобразование StringBuilder -> StringBuffer
        StringBuffer bufferFromBuilder = new StringBuffer(stringBuilder);
        System.out.println("StringBuilder -> StringBuffer: " + bufferFromBuilder);
    }
}
