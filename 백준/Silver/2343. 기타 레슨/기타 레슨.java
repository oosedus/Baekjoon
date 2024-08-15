import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 강의 수
        int M = Integer.parseInt(st.nextToken()); // 블루레이 수
        int[] lessons = new int[N];
        
        st = new StringTokenizer(br.readLine());
        int sum = 0;
        int maxLesson = 0;
        for (int i = 0; i < N; i++) {
            lessons[i] = Integer.parseInt(st.nextToken());
            sum += lessons[i];
            maxLesson = Math.max(maxLesson, lessons[i]);
        }
        
        int left = maxLesson, right = sum, answer = sum;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (isPossible(mid, lessons, M)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        System.out.println(answer);
    }
    
    private static boolean isPossible(int size, int[] lessons, int m) {
        int count = 1, currentSum = 0;
        for (int lesson : lessons) {
            if (currentSum + lesson > size) {
                count++;
                currentSum = 0;
            }
            currentSum += lesson;
        }
        return count <= m;
    }
}
