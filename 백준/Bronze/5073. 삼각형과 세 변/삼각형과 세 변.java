import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        while((input[0].equals("0") && input[1].equals("0") && input[2].equals("0")) != true ) {
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            int C = Integer.parseInt(input[2]);

            int max = Math.max(Math.max(A,B),C);

            if(max >= (A+B+C)-max) System.out.println("Invalid");
            else if (A == B && B == C) {
                System.out.println("Equilateral");
            } else if (A != B && B != C && A != C) {
                System.out.println("Scalene");
            } else System.out.println("Isosceles");

            input = br.readLine().split(" ");
        }
    }
}