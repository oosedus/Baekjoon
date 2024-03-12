import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        // scanner.next() 를 사용하면 안되는 이유: next()는 공백문자를 기준으로 입력받음
        // scanner.nextLine() 은 \n 를 기준으로 입력받음

        int number_1 = Integer.parseInt(input[0]);
        int number_2 = Integer.parseInt(input[1]);

        int answer = number_1 + number_2;

        System.out.println(answer);
    }
}