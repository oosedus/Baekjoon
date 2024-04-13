import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();

        for(int i = 0; i < cnt; i++) {
            String[] input = br.readLine().split(" ");
            if(input.length > 1) {
                stack.push(input[1]);
            }
            else if(input[0].equals("2")) {
                if(stack.empty() == false) {
                    bw.write(stack.pop()+ "\n");
                } else bw.write("-1"+ "\n");
            } else if (input[0].equals("3")) {
                bw.write(String.valueOf(stack.size())+ "\n");
            } else if (input[0].equals("4")) {
                if(stack.empty()) bw.write("1"+ "\n");
                else bw.write("0" + "\n");
            } else if (input[0].equals("5")) {
                if(stack.empty()) {
                    bw.write("-1"+ "\n");
                } else {
                    bw.write(stack.peek() + "\n");
                }
            }
        }
        bw.close();
    }
}
