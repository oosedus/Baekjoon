import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());

        Stack<String> stack = new Stack<>();

        for(int i = 0; i < cnt; i++) {
            String[] input = br.readLine().split(" ");
            if(input[0].equals("push")) stack.add(input[1]);
            else if (input[0].equals("top")) {
                if(stack.size() == 0) System.out.println(-1);
                else {
                    System.out.println(stack.peek());
                }
            } else if (input[0].equals("size")) {
                System.out.println(stack.size());
            } else if (input[0].equals("empty")) {
                if(stack.size() == 0) System.out.println(1);
                else System.out.println(0);
            } else if(input[0].equals("pop")) {
                if(stack.size() == 0) System.out.println(-1);
                else {
                    System.out.println(stack.pop());
                }
            }
        }
    }
}