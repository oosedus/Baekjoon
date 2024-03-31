import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Long input = Long.parseLong(br.readLine());

        int sum = 1;
        int answer = 0;

        if(input == 1){
            System.out.println(1);
        }
        else{
            while(input > sum) {
                sum += answer*6;
                answer++;
            }
            System.out.println(answer);
        }

    }
}
