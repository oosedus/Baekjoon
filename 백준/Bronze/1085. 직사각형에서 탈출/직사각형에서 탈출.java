import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);
        int h = Integer.parseInt(input[3]);

        int min = 1000;
        if(x<min) min = x;
        if(h-y < min) min = h-y;
        if(w-x < min) min = w-x;
        if(y < min) min = y;

        System.out.println(min);
    }
}