public class Basic_data_types {

    public static void main(String[] args) {
        System.out.println("Практика #1: Примеры базовых типов данных");
        byte byteValue = 0;
        short shortValue = 0;
        int intValue = 0;
        long longValue = 0L;

        float floatValue = 0.0f;
        double doubleValue = 0.0;

        char charValue = '\u0000';
        boolean booleanValue = false;

        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);
        System.out.println();

        System.out.println("Практика #2: Имя с использованием Unicode");
        System.out.println("\u041C\u0438\u0445\u0430\u0438\u043B");
        System.out.println();

        System.out.println("Практика #3: Ошибка области видимости");
        int a = 1;
        int c;
        {
            int b = 2;
            // b существует только в этом блоке
        }
        // c = a + b; // Ошибка: b недоступна за пределами блока {}
        System.out.println("Ошибка: переменная b не существует за пределами блока.");
        System.out.println();

        System.out.println("Практика #4: Перегрузка оператора +");
        String text = "Привет, ";
        String name = "Мир!";
        int number = 2024;
        System.out.println(text + name);  // Конкатенация строк
        System.out.println(text + number); // Конкатенация строки с числом
        System.out.println();


        System.out.println("Практика #5: Операции с различными типами");
        int i = 10;
        double d = 5.5;
        float f = 2.2f;

        double result1 = i + d; // int -> double
        float result2 = i + f; // int -> float
        System.out.println("int + double = " + result1);
        System.out.println("int + float = " + result2);
        System.out.println();

   
        System.out.println("Практика #6: Сужение диапазона значений");
        int largeInt = 300;
        byte narrowedByte = (byte) largeInt; // Потеря данных
        System.out.println("int -> byte: " + narrowedByte);
        System.out.println();

       
        System.out.println("Практика #7: Проблемы сужения типов");
        int a1 = 120;
        // byte b1 = a1 + 10; // Ошибка компиляции: требуется явное приведение
        byte c1 = (byte) (a1 + 10);
        // byte d1 = a1 + 1; // Ошибка компиляции: результат int
        System.out.println("Явное преобразование: " + c1);
        System.out.println();

        
        System.out.println("Практика #8: Использование var");
        // Явное указание типов вместо var
        int inferredInt = 42;
        String inferredString = "hi, Java!";
        
        System.out.println("int: " + inferredInt);
        System.out.println("String: " + inferredString);

    }
}
