import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int check[] = new int[30];

        for(int i = 1; i <= 30; i++){
            check[i-1] = 0;
        }

        for(int i = 0; i < 28; i++){
            int number = Integer.parseInt(br.readLine());
            check[number-1] = number;
        }

        int answer[] = new int[2];
        int tmp = 0;

        for(int i = 0; i < check.length; i++){
            if(check[i] == 0){
                answer[tmp] = i;
                tmp++;
            }
        }

        System.out.println(answer[0]+1);
        System.out.println(answer[1]+1);
    }
}