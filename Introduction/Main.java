package Introduction;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();

        System.out.print("Hello, ");
        System.out.println(name);
    }
}