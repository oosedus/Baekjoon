import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    static int N;
    static String[][] grid;
    static boolean[][] visited;
    static ArrayList<Integer> result;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0,};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        grid = new String[N][N];

        for(int i = 0; i < N; i++) {
            String[] input = br.readLine().split("");
            for(int j = 0; j < N; j++) {
                grid[i][j] = input[j];
            }
        }

        visited = new boolean[N][N];
        result = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if (grid[i][j].equals("1") && !visited[i][j]) {
                    int cnt = dfs(i, j, 0);
                    result.add(cnt);
                }
            }
        }

        Collections.sort(result);

        System.out.println(result.size());
        for(int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }

    private static int dfs(int i, int j, int cnt) {
        if(i < 0 || j < 0 || i >= N || j >= N || visited[i][j] || grid[i][j].equals("0")) {
            return cnt;
        }

        visited[i][j]=true;
        cnt++;

        for(int k = 0; k < 4; k++) {
            int x = i + dx[k];
            int y = j + dy[k];
            cnt = dfs(x, y, cnt);
        }

        return cnt;
    }
}
