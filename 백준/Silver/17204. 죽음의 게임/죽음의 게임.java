import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean[] visited;
    static int[] arr;
    static int result = 0;
    static int N, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dfs(0);

        System.out.println(result);

    }

    private static void dfs(int i) {
        if(visited[i]) {
            result = -1;
            return;
        }

        if(i == K){
            return;
        }
        else {
            visited[i] = true;
            result++;
            dfs(arr[i]);
        }
    }
}
