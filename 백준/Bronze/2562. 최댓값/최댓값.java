import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int index = 0;

        for(int i = 0; i < 9; i++){
            int input_number = Integer.parseInt(br.readLine());
            if(input_number > max){
                max = input_number;
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index+1);
    }
}