import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] first_input = br.readLine().split(" ");
        int basket_amount = Integer.parseInt(first_input[0]);
        int cnt = Integer.parseInt(first_input[1]);

        int basket[] = new int[basket_amount];

        for(int i = 1; i <= basket_amount; i++){
            basket[i-1] = i;
        }

        for(int i = 0; i < cnt; i++){
            String[] input = br.readLine().split(" ");
            int first = Integer.parseInt(input[0]);
            int second = Integer.parseInt(input[1]);

            int tmp = basket[first-1];
            basket[first-1] = basket[second-1];
            basket[second-1] = tmp;
        }

        for(int i = 0; i < basket_amount; i++){
            System.out.print(basket[i]);
            System.out.print(" ");
        }
    }
}