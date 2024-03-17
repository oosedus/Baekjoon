import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int number = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        String matchString = br.readLine();

        int count = 0;

        for(int i = 0; i < input.length; i++){
            if(matchString.equals(input[i])){
                count++;
            }
        }

        System.out.println(count);
    }
}