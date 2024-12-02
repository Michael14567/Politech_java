package Classes;

public class CustomEnumExample {
    // Перечисление для оценки с баллами
    public enum Grade {
        EXCELLENT(5), GOOD(4), SATISFACTORY(3), FAIL(2);

        private final int points;

        // Конструктор для перечисления
        Grade(int points) {
            this.points = points;
        }

        // Метод для получения баллов
        public int getPoints() {
            return points;
        }

        // Метод для проверки, является ли оценка положительной
        public boolean isPositive() {
            return this.points >= 3;
        }
    }

    public static void main(String[] args) {
        // Пример использования перечисления
        Grade grade = Grade.GOOD;

        System.out.println("Оценка: " + grade);
        System.out.println("Баллы: " + grade.getPoints());
        System.out.println("Положительная оценка? " + grade.isPositive());

        // Перебор всех значений перечисления
        System.out.println("\nВсе оценки и их баллы:");
        for (Grade g : Grade.values()) {
            System.out.printf("%s: %d, Положительная? %b%n", g, g.getPoints(), g.isPositive());
        }
    }
}
