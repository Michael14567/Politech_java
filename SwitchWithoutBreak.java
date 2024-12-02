public class SwitchWithoutBreak {
    public static void main(String[] args) {
        int value = 2;
        int i = 0;

        switch (value) {
            case 1:
                i = 1;
                System.out.println("Case 1: i = " + i);
                break; // Выполнение прерывается

            case 2:
                i = 2; // Этот код выполнится
                System.out.println("Case 2: i = " + i);
            case 3:
                i = 3; // Этот код тоже выполнится, так как отсутствует break
                System.out.println("Case 3: i = " + i);
                break; // Выполнение прерывается

            default:
                i = 4; // Если ни один из case не подошёл
                System.out.println("Default case: i = " + i);
                break;
        }
    }
}
