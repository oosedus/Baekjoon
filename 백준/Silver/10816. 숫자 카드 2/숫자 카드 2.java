import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(tokenizer.nextToken(" "));
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            }
            else {
                map.put(array[i], 1);
            }
        }

        int M = Integer.parseInt(reader.readLine());
        tokenizer = new StringTokenizer(reader.readLine());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(tokenizer.nextToken(" "));
            result.append(map.getOrDefault(num, 0)).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
