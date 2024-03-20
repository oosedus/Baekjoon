import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < num; i ++) {
            String[] input = br.readLine().split(" ");
            int cnt = Integer.parseInt(input[0]);
            String[] word = input[1].split("");
            
            for(String w:word) {
                int tmp = 0;
                while(tmp < cnt){
                    System.out.print(w);
                    tmp++;
                }
            }
            System.out.println();
        }
    }
}