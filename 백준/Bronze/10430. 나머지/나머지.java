import java.util.Scanner;

class Calculator {
    static int calculate_1(int A, int B, int C){
        return (A+B)%C;
    }
    static int calculate_2(int A, int B, int C){
        return ((A%C) + (B%C))%C;
    }
    static int calculate_3(int A, int B, int C){
        return (A*B)%C;
    }
    static int calculate_4(int A, int B, int C){
        return  ((A%C) * (B%C))%C;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);

        System.out.println(Calculator.calculate_1(A,B,C));
        System.out.println(Calculator.calculate_2(A,B,C));
        System.out.println(Calculator.calculate_3(A,B,C));
        System.out.println(Calculator.calculate_4(A,B,C));
    }
}