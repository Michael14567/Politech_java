package Data_Types_and_Operators;
public class SwitchVariableTypes {
    public static void main(String[] args) {
        // Пример с int
        int intValue = 2;
        switch (intValue) {
            case 1:
                System.out.println("Integer: 1");
                break;
            case 2:
                System.out.println("Integer: 2");
                break;
            default:
                System.out.println("Integer: Default case");
        }

        // Пример с String
        String stringValue = "hello";
        switch (stringValue) {
            case "hello":
                System.out.println("String: Hello!");
                break;
            case "bye":
                System.out.println("String: Goodbye!");
                break;
            default:
                System.out.println("String: Unknown");
        }

        // Пример с enum
        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY:
                System.out.println("Enum: Monday");
                break;
            case FRIDAY:
                System.out.println("Enum: Friday");
                break;
            default:
                System.out.println("Enum: Default case");
        }

        // Пример с char
        char charValue = 'A';
        switch (charValue) {
            case 'A':
                System.out.println("Char: A");
                break;
            case 'B':
                System.out.println("Char: B");
                break;
            default:
                System.out.println("Char: Default case");
        }
    }

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
