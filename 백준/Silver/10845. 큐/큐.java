import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());

        Deque<String> queue = new ArrayDeque();

        for(int i = 0; i < cnt; i++) {
            String[] input = br.readLine().split(" ");
            if(input[0].equals("push")) queue.addLast(input[1]);
            else if (input[0].equals("front")) {
                if(queue.size() == 0) System.out.println(-1);
                else {
                    System.out.println(queue.peekFirst());
                }
            } else if (input[0].equals("size")) {
                System.out.println(queue.size());
            } else if (input[0].equals("empty")) {
                if(queue.size() == 0) System.out.println(1);
                else System.out.println(0);
            } else if(input[0].equals("pop")) {
                if(queue.size() == 0) System.out.println(-1);
                else {
                    System.out.println(queue.poll());
                }
            } else if (input[0].equals("back")) {
                if(queue.size() == 0) System.out.println(-1);
                else {
                    System.out.println(queue.peekLast());
                }
            }
        }
    }
}