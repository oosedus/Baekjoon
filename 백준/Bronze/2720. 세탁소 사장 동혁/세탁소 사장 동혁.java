import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        ArrayList<Integer> changeDollar = new ArrayList<>();

        int[] unit = {25, 10, 5, 1};

        for(int i = 0; i < cnt; i++) {
            changeDollar.add(Integer.parseInt(br.readLine()));
        }

        int[][] answer = new int[cnt][4];

        for(int i = 0 ; i < cnt; i++) {
            int quota = changeDollar.get(i);
            int rest = 0;
            for(int j = 0; j < 4; j++) {
                answer[i][j] = quota / unit[j];
                quota = quota % unit[j];
            }
        }

        for(int i = 0; i < cnt; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.printf("%d ",answer[i][j]);
            }
            System.out.println();
        }
    }
}