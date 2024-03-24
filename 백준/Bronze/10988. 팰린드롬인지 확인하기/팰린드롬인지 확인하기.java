import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split("");
        int check = 1;
        for(int i = 0; i < input.length/2;i++){
            if(input[i].equals(input[input.length-i-1]) == false){
                check = 0;
            }
        }
        System.out.println(check);
    }
}