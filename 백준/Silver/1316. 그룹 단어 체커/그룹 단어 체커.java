
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        String[][] words = new String[count][];

        int answer = 0;
        int[] check = new int[count];

        for(int j:check){
            j = 0;
        }


        for(int i = 0; i < words.length; i++) {
            words[i] = br.readLine().split("");

            if(words[i].length == 1){
                continue;
            } else{
                for(int j = 0; j < words[i].length-1; j++){
                    if(words[i][j].equals(words[i][j+1]) == false){
                        for(int k = j+1; k < words[i].length;k++){
                            if(words[i][j].equals(words[i][k]) == true){
                                check[i] = 1;
                            }
                        }

                    }
                }
            }
        }
        for(int i = 0; i < check.length; i++) {
            if(check[i] == 0){
                answer++;
            }
        }
        System.out.println(answer);

    }
}