import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        int max = -1000000;
        int min = 1000000;

        for(int i = 0; i < cnt; i++){
            int input_number = Integer.parseInt(input[i]);
            if(input_number <= min){
                min = input_number;
            }
            if(input_number >= max){
                max = input_number;
            }
        }

        System.out.printf("%d %d", min, max);
    }
}