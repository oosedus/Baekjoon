import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int H, W;
    static int[] result;
    static String[][] grid;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        result = new int[T];

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());

            grid = new String[H][W];

            for(int j = 0; j < H; j++) {
                String[] tmp = br.readLine().split("");
                for(int k = 0; k < W; k++) {
                    grid[j][k] = tmp[k];
                }
            }

            visited = new boolean[H][W];

            int count = 0;
            for(int j = 0; j < H; j++) {
                for(int k = 0; k < W; k++) {
                    count += dfs(j, k);
                }
            }

            result[i] = count;
        }

        for(int i = 0; i < T; i++) {
            System.out.println(result[i]);
        }

    }

    private static int dfs(int j, int k){
        if(j < 0 || k < 0 || j >= H || k >= W || grid[j][k].equals(".") || visited[j][k]) {
            return 0;
        }

        visited[j][k]=true;

        dfs(j + 1, k);
        dfs(j - 1, k);
        dfs(j, k + 1);
        dfs(j, k - 1);

        return 1;
    }
}
