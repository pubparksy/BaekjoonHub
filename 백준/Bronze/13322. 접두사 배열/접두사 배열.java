import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int length = input.length();
        for (int i = 0; i < length; i++) {
            System.out.println(i);
        }
        scanner.close();
    }
}