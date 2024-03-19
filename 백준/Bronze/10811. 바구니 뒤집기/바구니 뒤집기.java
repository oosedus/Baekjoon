import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int amount = Integer.parseInt(input[0]);
        int times = Integer.parseInt(input[1]);

        int[] basket = new int[amount];

        for(int i = 0 ;i < amount; i++){
            basket[i] = i+1;
        }

        for(int i = 0; i < times; i++){
            String[] input2 = br.readLine().split(" ");
            int first = Integer.parseInt(input2[0]);
            int end = Integer.parseInt(input2[1]);
            int num = end;

            int[] tmp = basket.clone(); // 배열을 복사하고 싶을땐 clone()을 써서 복사해야함

            for(int j = first - 1 ; j <= end-1; j ++ ){
                basket[j] = tmp[num-1];
                num--;
            }
        }

        for(int i = 0; i < basket.length; i ++){
            System.out.printf("%d ", basket[i]);
        }

    }
}