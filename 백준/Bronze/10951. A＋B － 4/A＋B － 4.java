import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean check = true;
        String input = "";

        while((input = br.readLine()) != null){
            String[] numbers = input.split(" ");

            int number_1 = Integer.parseInt(numbers[0]);
            int number_2 = Integer.parseInt(numbers[1]);

            int result = number_1 + number_2;
            bw.write(result + "\n");
        }
        bw.close();
    }
}