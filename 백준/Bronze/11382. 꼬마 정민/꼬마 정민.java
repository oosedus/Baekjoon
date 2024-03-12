import java.util.Scanner;

class Calculator {
    static long calculate_1(long number_1, long number_2, long number_3){
        return number_1+number_2+number_3;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number_1 = Long.parseLong(scanner.next());
        long number_2 = Long.parseLong(scanner.next());
        long number_3 = Long.parseLong(scanner.next());

        System.out.println(Calculator.calculate_1(number_1,number_2,number_3));
    }
}