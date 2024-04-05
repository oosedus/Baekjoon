import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Long input = Long.parseLong(br.readLine());

        System.out.println(input*4);
    }
}
