import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split("");
        int num = Integer.parseInt(br.readLine());

        System.out.println(input[num-1]);
    }
}