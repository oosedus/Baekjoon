import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] first_input = br.readLine().split(" ");
        int basket_amount = Integer.parseInt(first_input[0]);
        int cnt = Integer.parseInt(first_input[1]);

        int basket[] = new int[basket_amount];

        for(int i = 0; i < cnt; i++){
            String[] input = br.readLine().split(" ");
            int start = Integer.parseInt(input[0]);
            int end = Integer.parseInt(input[1]);
            int number = Integer.parseInt(input[2]);

            for(int j = start-1; j <= end-1; j++){
                basket[j] = number;
            }
        }

        for(int i = 0; i < basket_amount; i++){
            System.out.print(basket[i]);
            System.out.print(" ");
        }
    }
}