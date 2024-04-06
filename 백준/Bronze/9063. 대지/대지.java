import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        ArrayList<ArrayList<Integer>> input = new ArrayList<>();

        int max_x = -10000;
        int max_y = -10000;
        int min_x = 10000;
        int min_y = 10000;

        for(int i = 0; i < num; i++) {
            String[] tmp = br.readLine().split(" ");
            int x = Integer.parseInt(tmp[0]);
            int y = Integer.parseInt(tmp[1]);

            if(x >= max_x) max_x = x;
            if(x <= min_x) min_x = x;

            if(y >= max_y) max_y = y;
            if(y <= min_y) min_y = y;
        }

        if(num == 1) System.out.println(0);
        else {
            System.out.println(Math.abs(max_x-min_x)*Math.abs(max_y-min_y));
        }
    }
}
