import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int first = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = 10000;

        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = first; i <= end; i++) {

            if(i == 1){
                continue;
            } else if (i == 2) {
                answer.add(i);
            } else{
                for(int j = 2; j < i; j++ ) {
                    if(i%j == 0) {
                        break;
                    } else if (j == i-1) {
                        answer.add(i);
                    }
                }
            }

        }

        for(int i:answer){
            sum+=i;

            if(i < min) min = i;
        }

        if(sum < 1) System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
