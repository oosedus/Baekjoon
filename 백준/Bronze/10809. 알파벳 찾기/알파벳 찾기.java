import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split("");

        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        int[] answer = new int[26];

        for(int i = 0; i < answer.length; i++){
            answer[i] = -1;
        }

        for(int j=0; j < input.length; j++) {
            for(int i = 0; i < alphabet.length; i++){
                if(input[j].equals(alphabet[i]) && answer[i] == -1) {
                    answer[i] = j;
                }
            }
        }

        for(int i = 0; i < answer.length; i++) {
            System.out.printf("%d ", answer[i]);
        }
    }
}