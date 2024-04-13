import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        Deque<String> queue = new LinkedList<>();


        for(int i = 0; i < cnt; i++) {
            String[] input = br.readLine().split(" ");

            if(input.length > 1) {
                queue.offer(input[1]);
            }
            else {
                if(input[0].equals("front")) {
                    if(queue.isEmpty()) bw.write("-1" + "\n");
                    else bw.write(queue.peek()+ "\n");
                } else if (input[0].equals("back")) {
                    if(queue.isEmpty()) bw.write("-1"+ "\n");
                    else bw.write(queue.peekLast()+ "\n");
                } else if(input[0].equals("pop")) {
                    if(queue.isEmpty()) bw.write("-1"+ "\n");
                    else bw.write(queue.poll()+ "\n");
                } else if (input[0].equals("size")) {
                    bw.write(String.valueOf(queue.size())+ "\n");
                } else if (input[0].equals("empty")) {
                    if(queue.isEmpty()) bw.write("1"+ "\n");
                    else bw.write("0"+ "\n");
                }
            }
        }
        bw.close();
    }
}