import java.util.Scanner;

class Calculator {
    static int calculate_1(int number_1, int number_2){
        return number_1*(number_2%10);
    }
    static int calculate_2(int number_1, int number_2){
        return number_1*((number_2%100)/10);
    }
    static int calculate_3(int number_1, int number_2){
        return number_1*(number_2/100);
    }
    static int calculate_4(int number_1, int number_2){
        return  number_1*number_2;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number_1 = Integer.parseInt(scanner.nextLine());
        int number_2 = Integer.parseInt(scanner.nextLine());

        System.out.println(Calculator.calculate_1(number_1,number_2));
        System.out.println(Calculator.calculate_2(number_1,number_2));
        System.out.println(Calculator.calculate_3(number_1,number_2));
        System.out.println(Calculator.calculate_4(number_1,number_2));
    }
}