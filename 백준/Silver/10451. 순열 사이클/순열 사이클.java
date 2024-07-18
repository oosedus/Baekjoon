import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<Integer>[] arr;
    static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        result = new int[T];

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            arr = new ArrayList[N+1];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i = 1; i <= N; i++) {
                arr[i] = new ArrayList<>();
            }

            for(int i = 1; i <= N; i++) {
                int x = Integer.parseInt(st.nextToken());
                arr[i].add(x);
                arr[x].add(i);
            }
            visited = new boolean[N+1];
            Arrays.fill(visited, false);

            int count = 0;
            for (int i = 1; i <= N ; i++) {
                if(!visited[i]) {
                    dfs(i);
                    count++;
                }
            }
            result[t] = count;
        }

        for(int i : result){
            System.out.println(i);
        }
    }

    private static void dfs(int i) {
        if(visited[i]) return;
        visited[i] = true;
        for(int j : arr[i]) {
            if(!visited[j]) {
                dfs(j);
            }
        }
    }
}
