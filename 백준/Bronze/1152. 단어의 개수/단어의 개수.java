import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        if(input.length > 0) {
            if(input[0].equals("")) System.out.println(input.length - 1);
            else System.out.println(input.length);
        }
        else System.out.println(input.length);
        
    }
}