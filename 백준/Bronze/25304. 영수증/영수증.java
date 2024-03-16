import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for(int i = 0; i < times ; i++){
            String[] input = scanner.nextLine().split(" ");
            int price = Integer.parseInt(input[0]);
            int amount = Integer.parseInt(input[1]);
            sum += price*amount;
        }
        
        if(total == sum){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}