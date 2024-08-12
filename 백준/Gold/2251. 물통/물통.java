import java.util.*;

public class Main {

    static boolean[][][] visited = new boolean[201][201][201];
    static boolean[] answer = new boolean[201];
    static int[] limits = new int[3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        limits[0] = sc.nextInt(); // A의 최대 용량
        limits[1] = sc.nextInt(); // B의 최대 용량
        limits[2] = sc.nextInt(); // C의 최대 용량

        dfs(0, 0, limits[2]);

        for (int i = 0; i <= limits[2]; i++) {
            if (answer[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void dfs(int a, int b, int c) {
        if (visited[a][b][c]) {
            return;
        }

        visited[a][b][c] = true;

        if (a == 0) {
            answer[c] = true;
        }

        // A -> B
        if (a + b > limits[1]) {
            dfs((a + b) - limits[1], limits[1], c);
        } else {
            dfs(0, a + b, c);
        }

        // A -> C
        if (a + c > limits[2]) {
            dfs((a + c) - limits[2], b, limits[2]);
        } else {
            dfs(0, b, a + c);
        }

        // B -> A
        if (b + a > limits[0]) {
            dfs(limits[0], (b + a) - limits[0], c);
        } else {
            dfs(b + a, 0, c);
        }

        // B -> C
        if (b + c > limits[2]) {
            dfs(a, (b + c) - limits[2], limits[2]);
        } else {
            dfs(a, 0, b + c);
        }

        // C -> A
        if (c + a > limits[0]) {
            dfs(limits[0], b, (c + a) - limits[0]);
        } else {
            dfs(c + a, b, 0);
        }

        // C -> B
        if (c + b > limits[1]) {
            dfs(a, limits[1], (c + b) - limits[1]);
        } else {
            dfs(a, c + b, 0);
        }
    }
}
