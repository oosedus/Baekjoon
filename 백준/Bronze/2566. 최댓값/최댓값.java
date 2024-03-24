import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int row = 0;
        int column = 0;

        String[][] input = new String[9][9];

        for(int i = 0; i < 9; i++) {
            input[i] = br.readLine().split(" ");
        }

        int[][] number = new int[9][9];

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                number[i][j] = Integer.parseInt(input[i][j]);
                if(number[i][j] > max) {
                    max = number[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        System.out.println(max);
        System.out.printf("%d %d", row+1, column+1);
    }
}