import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] first_input = br.readLine().split(" ");
        int cnt = Integer.parseInt(first_input[0]);
        int number = Integer.parseInt(first_input[1]);
        String[] input = br.readLine().split(" ");

        for(int i = 0; i < cnt; i++){
            int input_number = Integer.parseInt(input[i]);
            if(input_number < number){
                System.out.print(input_number);
                System.out.print(" ");
            }
        }
    }
}