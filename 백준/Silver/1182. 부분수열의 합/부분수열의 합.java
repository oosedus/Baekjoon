import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        input = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;
        for (int i = 1; i <= N; i++) {
            answer += combination(new boolean[input.length], 0, N, i, S, 0);
        }

        System.out.println(answer);
    }

    private static int combination(boolean[] visited, int start, int n, int r, int targetSum, int currentSum) {
        if (r == 0) {
            if (currentSum == targetSum) {
                return 1;
            } else {
                return 0;
            }
        }

        int count = 0;
        for (int i = start; i < n; i++) {
            visited[i] = true;
            count += combination(visited, i + 1, n, r - 1, targetSum, currentSum + input[i]);
            visited[i] = false;
        }
        return count;
    }
}
