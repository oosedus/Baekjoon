import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        while(input[0].equals("0") != true){
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);

            if(A%B == 0) System.out.println("multiple");
            else if(B%A == 0) System.out.println("factor");
            else System.out.println("neither");

            input = br.readLine().split(" ");
        }
    }
}