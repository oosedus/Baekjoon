import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] tokens = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                if(tokens[j].equals("-")) { matrix[i][j] = 0; }
                else { matrix[i][j] = 1; }
            }
        }

        int count = 0;
        int row = 0;
        int col = 0;
        while(row < n && col < m) {
            if(matrix[row][col] == 0) {
                while(matrix[row][col] == 0) {
                    matrix[row][col] = -1;
                    col++;
                    if(col == m) {row++; col = 0; break;}
                }
                count++;
            }
            else if(matrix[row][col] == 1) {
                int tmp = row;
                while(matrix[tmp][col] == 1) {
                    matrix[tmp][col] = -1;
                    tmp++;
                    if(tmp == n) {break;}
                }
                col++;
                count++;
                if(col == m) {
                    row++;
                    col = 0;
                }
            }
            else if(matrix[row][col] == -1 && col < m-1) {
                col++;
            } else if(matrix[row][col] == -1 && col == m - 1) {
                row++;
                col = 0;
            }
        }
        System.out.println(count);
    }
}