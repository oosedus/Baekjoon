import java.util.Scanner;

class CompareMachine{

    static int compare(int number_1, int number_2){
        if(number_1 > number_2) return 1;
        else if (number_1 == number_2) {
            return 2;
        }
        else return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number_1 = Integer.parseInt(scanner.next());
        int number_2 = Integer.parseInt(scanner.next());

        // Switch 문에서는 case 마다 break를 걸어야함
        switch (CompareMachine.compare(number_1, number_2)){
            case 1 :
                System.out.println(">");
                break;
            case 2 :
                System.out.println("==");
                break;
            case 0 :
                System.out.println("<");
                break;
        }
    }
}