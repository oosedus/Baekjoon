import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        int[] result = new int[T];

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(reader.readLine());
            int n = Integer.parseInt(reader.readLine());

            int[][] arr = new int[k+1][n+1];

            for (int j = 1; j <= n; j++) {
                arr[0][j] = j;
            }

            result[i] = countPeople(arr, k, n);
        }

        for (int i = 0; i < T; i++) {
            System.out.println(result[i]);
        }
    }

    private static int countPeople(int[][] arr, int k, int n) {

        if(arr[k][n] != 0){
            return arr[k][n];
        }

        for(int i = 1; i <= n; i++){
            arr[k][n] += countPeople(arr, k-1, i);
        }

        return arr[k][n];
    }
}
