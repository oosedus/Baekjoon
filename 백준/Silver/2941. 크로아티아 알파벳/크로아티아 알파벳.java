
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split("");

        int cnt = 0;
        int i;
        int check = 0;

        if(input.length == 1) cnt++;
        else {
            for(i = 0; i < input.length-1 ; i++) {
                if(input[i].equals("c") && input[i+1].equals("=")) { cnt++; i++; check++;}
                else if(input[i].equals("c") && input[i+1].equals("-")) { cnt++; i++; check++;}
                else if(input[i].equals("d") && input[i+1].equals("-")) { cnt++; i++; check++;}
                else if(input[i].equals("l") && input[i+1].equals("j")) { cnt++; i++; check++;}
                else if(input[i].equals("n") && input[i+1].equals("j")) { cnt++; i++; check++;}
                else if(input[i].equals("s") && input[i+1].equals("=")) { cnt++; i++; check++;}
                else if(input[i].equals("z") && input[i+1].equals("=")) {
                    cnt++;
                    i++;
                    check++;
                    if (i != 0) {
                        if (input[i - 1].equals("d")) cnt--;
                    }
                }
                else if(i < input.length-2 && input[i].equals("d") && input[i+1].equals("z") && input[i+2].equals("=")) {
                    cnt++;
                    i += 2;
                    check++;
                }
                else if(i == input.length-2){
                    cnt++;
                    cnt++;
                    check = 0;
                }
                else {
                    cnt++;
                }
            }
            if(i == input.length-1 && check != 0) cnt++;
        }

        System.out.println(cnt);
    }
}