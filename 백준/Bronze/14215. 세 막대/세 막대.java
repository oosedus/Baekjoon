import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);

        int max = Math.max(Math.max(A,B),C);
        
        if(A+B+C-max > max) System.out.println(A+B+C);
        else {
            System.out.println(2*(A+B+C-max)-1);
        }
    }
}