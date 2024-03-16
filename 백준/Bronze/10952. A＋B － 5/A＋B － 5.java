import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean check = true;

        while(check){
            String[] input = br.readLine().split(" ");
            int number_1 = Integer.parseInt(input[0]);
            int number_2 = Integer.parseInt(input[1]);

            if(number_1 == 0 && number_2 == 0){
                check = false;
                break;
            }
            else{
                int result = number_1 + number_2;
                bw.write(result + "\n");
            }
        }
        bw.close();
    }
}