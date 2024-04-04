import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        int answer = 0;
        String[] input = br.readLine().split(" ");
        int[] numbers = new int[input.length];

        for(int i = 0; i<numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);

            if(numbers[i] == 1){
                continue;
            } else if (numbers[i] == 2) {
                answer++;
            } else{
                for(int j = 2; j < numbers[i]; j++ ) {
                    if(numbers[i]%j == 0) {
                        break;
                    } else if (j == numbers[i]-1) {
                        answer++;
                    }
                }
            }

        }
        System.out.println(answer);
    }
}
