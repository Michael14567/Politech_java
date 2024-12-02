package Inner;

public class StaticNestedClassesExample {

    // Внешний класс
    public static class OuterClass {
        private static String staticField = "Статическое поле внешнего класса";
        private String nonStaticField = "Нестатическое поле внешнего класса";

        // Статический вложенный класс
        public static class NestedClass {
            public void display() {
                // Доступ только к статическим полям внешнего класса
                System.out.println("Доступ к статическому полю: " + staticField);
                // Следующий код вызовет ошибку компиляции:
                // System.out.println("Доступ к нестатическому полю: " + nonStaticField);
            }
        }

        // Нестатический метод внешнего класса, создающий экземпляр вложенного класса
        public void createNestedInstance() {
            NestedClass nested = new NestedClass();
            nested.display();
        }
    }

    public static void main(String[] args) {
        // Создание экземпляра вложенного класса без экземпляра внешнего класса
        System.out.println("=== Пример использования статического вложенного класса ===");
        OuterClass.NestedClass nested = new OuterClass.NestedClass();
        nested.display();

        // Создание вложенного класса через метод внешнего класса
        System.out.println("\n=== Создание вложенного класса через внешний класс ===");
        OuterClass outer = new OuterClass();
        outer.createNestedInstance();
    }
}
