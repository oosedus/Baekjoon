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
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int N = Integer.parseInt(tokenizer.nextToken());
            int M = Integer.parseInt(tokenizer.nextToken());

            int[] A = new int[N];
            int[] B = new int[M];

            tokenizer = new StringTokenizer(reader.readLine());
            for (int j = 0; j < N; j++) {
                A[j] = Integer.parseInt(tokenizer.nextToken());
            }

            tokenizer = new StringTokenizer(reader.readLine());
            for(int k = 0; k < M; k++) {
                B[k] = Integer.parseInt(tokenizer.nextToken());
            }

            Arrays.sort(B);

            int count = 0;
            for (int j = 0; j < N; j++) {
                count += binarySearch(B, A[j]);
            }

            result[i] = count;

        }

        for(int i = 0; i < T; i++) {
            System.out.println(result[i]);
        }
    }

    private static int binarySearch(int[] A, int target) {
        int left = 0;
        int right = A.length - 1;
        int idx = 0;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(A[mid] < target) {
                left = mid + 1;
                idx = mid + 1;
            }
            else {
                right = mid -1;
            }
        }
        return idx;
    }
}
