import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        Long sum = 0L;

        for(int i = 0; i < cnt; i++) {
            int input = Integer.parseInt(br.readLine());

            if(input != 0) stack.push(input);
            else {
                if(stack.empty()) continue;
                else stack.pop();
            }

        }

        for(int i : stack) {
            sum += i;
        }

        bw.write(String.valueOf(sum));
        
        bw.close();
    }
}