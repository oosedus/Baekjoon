import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    static String[][] input = new String[5][5];
    static HashSet<String> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                input[i][j] = st.nextToken();
            }
        }


        for(int i = 0 ; i < input.length; i++) {
            for(int j = 0; j < input.length; j++) {
                String numbers = "";
                dfs(i,j, numbers);
            }
        }

        System.out.println(set.size());
    }

    private static void dfs(int i,int j, String numbers) {
        if(numbers.length() == 6) {
            set.add(numbers);
            return;
        }

        if((i < 0) || (j < 0) || (i > 4) || (j > 4)) {
            return;
        }

        numbers += input[i][j];

        dfs(i - 1, j, numbers);
        dfs(i + 1, j, numbers);
        dfs(i, j - 1, numbers);
        dfs(i, j + 1, numbers);
    }

}
