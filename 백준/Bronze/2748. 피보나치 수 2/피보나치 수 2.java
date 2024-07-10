import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Map<Integer, Long> map = new HashMap<>();

        long result = fibonacci(n, map);

        System.out.println(result);

    }

    private static long fibonacci(int n, Map<Integer, Long> map) {

        if(n <= 1) return n;

        if(map.containsKey(n)) {
            return map.get(n);
        }

        long result = fibonacci(n-1, map) + fibonacci(n-2, map);
        map.put(n, result);
        return result;

    }
}
