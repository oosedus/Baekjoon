import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.next());
        int y = Integer.parseInt(scanner.next());
        
        if(x > 0 && y > 0) System.out.println("1");
        if(x < 0 && y > 0) System.out.println("2");
        if(x < 0 && y < 0) System.out.println("3");
        if(x > 0 && y < 0) System.out.println("4");
    }
}