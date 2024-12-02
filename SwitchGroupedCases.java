public class SwitchGroupedCases {
    public static void main(String[] args) {
        int value = 2;

        switch (value) {
            case 1:
            case 2:
            case 3:
                System.out.println("Value is 1, 2, or 3");
                break;

            default:
                System.out.println("Value is something else");
        }
    }
}
