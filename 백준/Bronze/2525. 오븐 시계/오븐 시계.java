import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int hour = Integer.parseInt(input[0]);
        int minute = Integer.parseInt(input[1]);
        int time = Integer.parseInt(scanner.nextLine());

        if((minute+time) < 60){
            System.out.printf("%d %d", hour, minute+time);
        }
        if((minute+time) >= 60){
            hour += (minute+time)/60;
            minute = (minute+time)%60;
            if(hour > 23){
                hour = hour%24;
            }
            System.out.printf("%d %d", hour, minute);
        }
    }
}