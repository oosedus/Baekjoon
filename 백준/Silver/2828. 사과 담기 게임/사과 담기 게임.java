import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(scanner.nextLine());

        int screen = Integer.parseInt(st.nextToken());
        int basket = Integer.parseInt(st.nextToken());

        int num = Integer.parseInt(scanner.nextLine());

        int left = 1;
        int right = basket;

        int sum = 0;

        for(int i = 0; i < num; i++){
            int apple = Integer.parseInt(scanner.nextLine());

            if((apple >= left) && (apple <= right)) continue;
            else if (apple > right) {
                sum += apple - right;
                left = left + (apple - right);
                right = apple;
            } else if (apple < left) {
                sum += left - apple;
                right = right - (left - apple);
                left = apple;
            }
        }

        System.out.println(sum);

    }
}
