import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[][] A = new int[N][M];

        for(int i = 0; i < N; i++){
            String[] inputRow = br.readLine().split(" ");
            for(int j = 0; j < M; j++){
                A[i][j] = Integer.parseInt(inputRow[j]);
            }
        }
        for(int i = 0; i < N; i++){
            String[] inputRow = br.readLine().split(" ");
            for(int j = 0; j < M; j++){
                A[i][j] += Integer.parseInt(inputRow[j]);
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                System.out.printf("%d ", A[i][j]);
            }
            System.out.println();
        }
    }
}