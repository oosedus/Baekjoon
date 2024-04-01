import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        int plus = 1;
        int sum = 1;

        while(input >= sum) {
            sum += plus;
            plus++;
        }

        int line = plus-1;
        int point = input - (sum-plus);

        int x = 0;
        int y = 0;

        if((line%2)==0) {
            x = point;
            y = line - point +1;
        }
        else {
            x = line - point +1;
            y = point;
        }

        System.out.printf("%d/%d",x,y);
    }
}