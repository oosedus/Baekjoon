import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.next());

        if(number >= 90) System.out.println("A");
        else if (90 > number && number >= 80 ) {
            System.out.println("B");
        } else if (80 > number && number >=70 ) {
            System.out.println("C");
        } else if (70 > number && number >= 60 ) {
            System.out.println("D");
        } else System.out.println("F");
    }
}