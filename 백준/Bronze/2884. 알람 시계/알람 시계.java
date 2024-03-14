import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.next());
        int minute = Integer.parseInt(scanner.next());

        if(minute >= 45) System.out.printf("%d %d", hour, minute-45);
        if(hour < 1 && minute < 45) System.out.printf("23 %d", 60-(45-minute));
        if(hour >= 1 && minute < 45) System.out.printf("%d %d", hour-1, 60-(45-minute));
    }
}