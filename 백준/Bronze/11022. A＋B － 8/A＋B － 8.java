import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int times = Integer.parseInt(br.readLine());

        for(int i = 1; i <= times; i++){
            String[] input = br.readLine().split(" ");
            int number_1 = Integer.parseInt(input[0]);
            int number_2 = Integer.parseInt(input[1]);
            int result = number_2 + number_1;

            bw.write("Case #"+i+": "+number_1+" + "+number_2+" = "+ result + "\n");
        }
        bw.close();
    }
}