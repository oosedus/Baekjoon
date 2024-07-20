import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        Arrays.fill(visited, false);

        for(int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            graph[A].add(B);
            graph[B].add(A);
        }

        for(int i = 1; i <= N; i++) {
            if(!visited[i]) {
                dfs(i);
                result++;
            }
        }

        bw.write(result + "\n");
        bw.close();
    }

    public static void dfs(int start) {
        visited[start] = true;

        for(int i = 0; i < graph[start].size(); i++) {
            int next = graph[start].get(i);

            if(!visited[next]) {
                dfs(next);
            }
        }
    }
}
