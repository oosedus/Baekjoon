import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int charge = 1000 - Integer.parseInt(sc.nextLine());
        int sum = 0;

        if(charge >= 500) {
            sum += (charge / 500);
            charge %= 500;
        }

        if(charge >= 100){
            sum += (charge / 100);
            charge %= 100;
        }

        if(charge >= 50){
            sum += (charge / 50);
            charge %= 50;
        }

        if(charge >= 10){
            sum += (charge / 10);
            charge %= 10;
        }

        if(charge >= 5){
            sum += (charge / 5);
            charge %= 5;
        }

        if(charge >= 1){
            sum += (charge / 1);
        }

        System.out.println(sum);

    }

}
