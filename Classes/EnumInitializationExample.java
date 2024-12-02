package Classes;

public class EnumInitializationExample {
    // Перечисление дней недели
    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        // Инициализация переменной перечисления
        Day day = Day.MONDAY;

        // Использование перечисления в switch
        switch (day) {
            case MONDAY:
                System.out.println("Начало недели!");
                break;
            case FRIDAY:
                System.out.println("Пятница! Конец рабочей недели.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Выходные!");
                break;
            default:
                System.out.println("Обычный рабочий день.");
        }

        // Перебор всех значений перечисления
        System.out.println("\nВсе дни недели:");
        for (Day d : Day.values()) {
            System.out.println(d);
        }
    }
}
