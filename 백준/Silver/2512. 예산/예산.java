import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());  // 지방의 수
        int[] requests = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();  // 각 지방의 예산 요청
        int totalBudget = Integer.parseInt(br.readLine());  // 총 예산

        // 이진 탐색을 위한 초기 설정
        int low = 0, high = Arrays.stream(requests).max().getAsInt();
        int answer = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            long sum = 0;

            for (int request : requests) {
                sum += Math.min(request, mid);
            }

            if (sum > totalBudget) {
                high = mid - 1;
            } else {
                answer = mid;
                low = mid + 1;
            }
        }

        System.out.println(answer);
    }
}
