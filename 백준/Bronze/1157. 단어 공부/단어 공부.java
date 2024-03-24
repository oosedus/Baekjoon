import java.io.*;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine().toUpperCase();
        String[] words = input.split("");
        
        // 중복제거
        HashSet<String> hashSet_ = new HashSet<>(Arrays.asList(words));
        String[] setWords = hashSet_.toArray(new String[hashSet_.size()]);

        int[] count = new int[setWords.length];

        for(int i = 0; i < setWords.length; i++) {
            int cnt = 0;
            for(int j = 0; j < words.length; j++) {
                if(setWords[i].equals(words[j])){
                    cnt++;
                }
            }
            count[i] = cnt;
        }
        
        int max = 0;
        int check = 0;
        String answer = "";
        for(int i = 0; i < setWords.length; i++) {
            if(count[i] > max) {
                max = count[i];
                answer = setWords[i];
            } else if(count[i] == max) {
                answer = "?";
            }
        }

        System.out.println(answer);
    }
}