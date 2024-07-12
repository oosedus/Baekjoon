import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        long[] result = new long[T];

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            result[i] = calculateCombination(N, M);
        }

        for (long res : result) {
            System.out.println(res);
        }
    }

    private static long calculateCombination(int n, int m) {
        if (n > m - n) n = m - n;

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * (m - i + 1) / i;
        }
        return result;
    }
}
