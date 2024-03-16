import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //scanner보다 빠름
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int times = Integer.parseInt(br.readLine());

        for(int i = 0; i < times; i++){
            String[] input = br.readLine().split(" ");
            int number_1 = Integer.parseInt(input[0]);
            int number_2 = Integer.parseInt(input[1]);
            int result = number_2 + number_1;

            bw.write(result + "\n");
        }
        bw.close(); // BufferWriter를 사용할 시에는 close()를 꼭 적어야지 작동함
    }
}