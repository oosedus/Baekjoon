import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] input = new String[5][5];
        int max = 0;
        int maxLineIndex = 0;

        for(int i = 0; i < 5; i++) {
            input[i] = br.readLine().split("");
            if(input[i].length > max) {
                max = input[i].length;
                maxLineIndex = i;
            }
        }

        for(int i = 0; i < input[maxLineIndex].length; i++){
            for(int j =0; j < 5; j++) {
                try{
                    System.out.print(input[j][i]);
                } catch (ArrayIndexOutOfBoundsException e){
                    continue;
                }

            }
        }
    }
}