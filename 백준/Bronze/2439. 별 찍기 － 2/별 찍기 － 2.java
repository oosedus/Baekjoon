import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int times = Integer.parseInt(br.readLine());
        String star = "*";
        String whiteSpace = " ";

        for(int i = 1; i <= times; i++){
            String result = "";
            for(int j = times ; j > i; j--){
                result = result.concat(whiteSpace);
            }
            for(int k = 0; k < i; k++){
                result = result.concat(star);
            }
            bw.write(result+ "\n");
        }
        bw.close();
    }
}