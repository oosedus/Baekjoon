import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for(int i=0; i < num; i++){
            String[] input = br.readLine().split("");
            int end_idx = input.length-1;
            System.out.printf("%s%s\n", input[0], input[end_idx]);
        }
    }
}