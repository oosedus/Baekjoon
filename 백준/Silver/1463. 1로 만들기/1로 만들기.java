import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(reader.readLine());
        arr = new int[X+1];
        Arrays.fill(arr, -1);
        arr[0] = 0;
        arr[1] = 0;

        System.out.println(countMin(X));
    }

    private static int countMin(int n){

        if(arr[n] == -1) {
            if((n%2 == 0) && (n%3 == 0)){
                arr[n] = Math.min(countMin(n / 3), Math.min(countMin(n / 2), countMin(n - 1))) + 1;
            }
            else if (n%3 == 0) {
                arr[n] = Math.min(countMin(n / 3), countMin(n - 1)) + 1;
            }
            else if (n%2 == 0) {
                arr[n] = Math.min(countMin(n / 2), countMin(n - 1)) + 1;
            }
            else {
                arr[n] = countMin(n - 1) + 1;
            }
        }
        return arr[n];
    }
}
