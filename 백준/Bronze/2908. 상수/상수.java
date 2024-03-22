import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);

        int hundred1 = num1/100;
        int ten1 = (num1%100)/10;
        int one1 = num1%10;

        int hundred2 = num2/100;
        int ten2 = (num2%100)/10;
        int one2 = num2%10;

        int new_num1 = one1*100+ten1*10+hundred1;
        int new_num2 = one2*100+ten2*10+hundred2;

        int max = Math.max(new_num1, new_num2);

        System.out.println(max);
    }
}