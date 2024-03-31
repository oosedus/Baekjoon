import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        int first = 3;

        for(int i = 1; i < input; i++) {
            first = first*2-1;
        }

        System.out.println(first*first);
    }
}
