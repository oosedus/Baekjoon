import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int[] chess = new int[input.length];
        int[] answer = {1,1,2,2,2,8};
        for(int i = 0 ; i < chess.length; i++){
            chess[i] = Integer.parseInt(input[i]);
            answer[i] = answer[i] - chess[i];
            System.out.printf("%d ", answer[i]);
        }
    }
}