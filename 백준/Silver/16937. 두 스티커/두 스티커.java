import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static int H;
    static int W;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        H = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(br.readLine());

        arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                max = Math.max(max, checkAllCases(i, j));
            }
        }

        System.out.println(max);
    }

    public static int checkAllCases(int i, int j) {
        int maxArea = 0;

        int[][] stickers = {
                {arr[i][0], arr[i][1]}, {arr[i][1], arr[i][0]},
                {arr[j][0], arr[j][1]}, {arr[j][1], arr[j][0]}
        };

        for (int k = 0; k < 2; k++) {
            for (int l = 2; l < 4; l++) {
                int x1 = stickers[k][0], y1 = stickers[k][1];
                int x2 = stickers[l][0], y2 = stickers[l][1];

                if (x1 <= H && y1 <= W) {
                    // 첫 번째 스티커를 붙이고, 남은 아래 부분에 두번째 스티커가 들어가는 경우
                    if (x2 <= H && y2 <= W - y1) {
                        maxArea = Math.max(maxArea, x1 * y1 + x2 * y2);
                    }
                    // 첫 번째 스티커를 붙이고, 남은 오른쪽 부분에 두번째 스티커가 들어가는 경우
                    if (x2 <= H - x1 && y2 <= W) {
                        maxArea = Math.max(maxArea, x1 * y1 + x2 * y2);
                    }
                }

                if (y1 <= H && x1 <= W) {
                    // 첫 번째 스티커를 회전하여 붙이고, 남은 아래 부분에 두번째 스티커가 들어가는 경우
                    if (y2 <= H && x2 <= W - x1) {
                        maxArea = Math.max(maxArea, x1 * y1 + x2 * y2);
                    }
                    // 첫 번째 스티커를 회전하여 붙이고, 남은 오른쪽 부분에 두번째 스티커가 들어가는 경우
                    if (y2 <= H - y1 && x2 <= W) {
                        maxArea = Math.max(maxArea, x1 * y1 + x2 * y2);
                    }
                }
            }
        }

        return maxArea;
    }
}
