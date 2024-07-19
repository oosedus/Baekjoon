import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split("");
        Long[] arr = new Long[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Long.parseLong(input[i]);
        }

        Collections.sort(Arrays.asList(arr), Collections.reverseOrder());

        for (Long num : arr) {
            bw.write(num + "");
        }

        bw.close();
    }
}
