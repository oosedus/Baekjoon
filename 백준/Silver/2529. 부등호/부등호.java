import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int k;
    static String[] sign;
    static boolean[] visited;
    static String maxAnswer = "";
    static String minAnswer = "";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        k = Integer.parseInt(br.readLine());
        sign = br.readLine().split(" ");

        visited = new boolean[10];

        findMaxAnswer(0, "");
        Arrays.fill(visited, false);
        findMinAnswer(0, "");

        System.out.println(maxAnswer);
        System.out.println(minAnswer);
    }

    private static void findMaxAnswer(int index, String num) {
        if (index == k + 1) {
            if (maxAnswer.equals("") || maxAnswer.compareTo(num) < 0) {
                maxAnswer = num;
            }
            return;
        }

        for (int i = 9; i >= 0; i--) {
            if (visited[i]) continue;
            if (index == 0 || check(num.charAt(index - 1) - '0', i, sign[index - 1])) {
                visited[i] = true;
                findMaxAnswer(index + 1, num + i);
                visited[i] = false;
            }
        }
    }

    private static void findMinAnswer(int index, String num) {
        if (index == k + 1) {
            if (minAnswer.equals("") || minAnswer.compareTo(num) > 0) {
                minAnswer = num;
            }
            return;
        }

        for (int i = 0; i <= 9; i++) {
            if (visited[i]) continue;
            if (index == 0 || check(Integer.parseInt(String.valueOf(num.charAt(index-1))), i, sign[index - 1])) {
                visited[i] = true;
                findMinAnswer(index + 1, num + i);
                visited[i] = false;
            }
        }
    }

    private static boolean check(int a, int b, String s) {
        if (s.equals("<")) {
            return a < b;
        } else {
            return a > b;
        }
    }
}
