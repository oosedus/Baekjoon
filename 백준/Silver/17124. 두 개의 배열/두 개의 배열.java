import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    // 전역 변수 선언으로 메모리 할당 최소화
    static int N, M;
    static int[] A, B;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim()); // 테스트 케이스 수
        
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            N = Integer.parseInt(st.nextToken()); // 배열 A의 크기
            M = Integer.parseInt(st.nextToken()); // 배열 B의 크기
            A = new int[N];
            B = new int[M];
            
            // A 배열 입력
            st = new StringTokenizer(br.readLine().trim());
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }
            
            // B 배열 입력 및 정렬
            st = new StringTokenizer(br.readLine().trim());
            for (int i = 0; i < M; i++) {
                B[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(B);
            
            long sum = 0; // 결과 합계 초기화
            for (int value : A) {
                sum += findClosest(value);
            }
            
            System.out.println(sum);
        }
    }
    
    // 가장 가까운 B 배열의 값 찾기
    private static int findClosest(int target) {
        int index = Arrays.binarySearch(B, target);
        if (index >= 0) {
            return B[index];
        }
        
        // 최근접 이웃 인덱스 찾기
        int insertPoint = -(index + 1);
        int leftDist = insertPoint > 0 ? Math.abs(target - B[insertPoint - 1]) : Integer.MAX_VALUE;
        int rightDist = insertPoint < M ? Math.abs(target - B[insertPoint]) : Integer.MAX_VALUE;
        
        if (leftDist <= rightDist) {
            return insertPoint > 0 ? B[insertPoint - 1] : B[insertPoint];
        } else {
            return insertPoint < M ? B[insertPoint] : B[insertPoint - 1];
        }
    }
}
