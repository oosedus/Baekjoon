import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        String[][] input = new String[num][2];
        int[][] xy = new int[num][2];

        for(int i = 0; i< num; i++) {
            input[i] = br.readLine().split(" ");
            for(int j = 0; j < 2; j++){
                xy[i][j] = Integer.parseInt(input[i][j]);
            }
        }

        int[][] answer = new int[101][101];

        for(int i = 0; i < num; i++) {
            for(int j = xy[i][0]-1; j < xy[i][0]+9; j++) {
                for(int k = xy[i][1]-1; k < xy[i][1]+9;k++){
                    answer[j][k] =1;
                }
            }
        }
        int sum = 0;
        for(int[] a:answer) {
            for(int b:a) {
                if(b == 1){
                    sum += 1;
                }
            }
        }
        System.out.println(sum);
    }
}