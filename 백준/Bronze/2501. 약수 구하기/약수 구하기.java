import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        ArrayList<Integer> factors = new ArrayList<>();

        for(int i = 1; i <= N; i++) {
            if(N%i == 0) factors.add(i);
        }

        if(factors.size() < K) System.out.println(0);
        else {
            System.out.println(factors.get(K-1));
        }
    }
}
