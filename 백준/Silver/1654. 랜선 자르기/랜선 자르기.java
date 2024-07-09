import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        long[] lans = new long[K];
        long max = 0;

        for (int i = 0; i < K; i++) {
            lans[i] = Long.parseLong(reader.readLine());
            if(lans[i] > max) {
                max = lans[i];
            }
        }

        long left = 1;
        long right = max;
        long result = 0;

        while(left <= right) {
            long mid = (left + right) / 2;
            int tmpResult = checkLans(lans, mid);
            if(tmpResult >= N){
                result = mid;
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        System.out.println(result);

    }

    private static int checkLans(long[] lans, long length) {
        int sum = 0;
        for (int i = 0; i < lans.length; i++) {
            sum += lans[i] / length;
        }
        return sum;
    }
}
