import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        int number_1 = Integer.parseInt(input[0]);
        int number_2 = Integer.parseInt(input[1]);

        double answer = (double) number_1 / number_2;

        System.out.println(answer);
    }
}