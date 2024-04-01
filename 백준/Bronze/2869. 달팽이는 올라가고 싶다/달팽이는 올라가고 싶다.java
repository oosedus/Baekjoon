import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int V = Integer.parseInt(input[2]);

        int oneDayMeter = A-B;

        int rest = V - A;
        
        if(rest % oneDayMeter == 0) {
            int answer = rest / oneDayMeter + 1;
            System.out.println(answer);
        }
        else {
            int answer = rest / oneDayMeter + 2;
            System.out.println(answer);
        }
    }
}