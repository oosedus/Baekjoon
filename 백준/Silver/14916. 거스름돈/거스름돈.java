import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int minCoins = -1;
        for (int i = n / 5; i >= 0; i--) {
            int remaining = n - (i * 5);
            if (remaining % 2 == 0) {
                minCoins = i + (remaining / 2);
                break;
            }
        }

        System.out.println(minCoins);
    }
}
