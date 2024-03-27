import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int num = Integer.parseInt(input[1]);

        ArrayList<Integer> remainder = new ArrayList<>();
        int quotient = N;

        while( quotient > 0) {
            remainder.add(quotient%num);
            quotient = quotient/num;
        }

        ArrayList<String> answer = new ArrayList<>();

        for(int i = 0; i < remainder.size(); i++) {
            if(remainder.get(i) < 10){
                answer.add(i,remainder.get(i).toString());
            }
            else{
                if(remainder.get(i) == 10) answer.add(i, "A");
                else if(remainder.get(i) == 11) answer.add(i, "B");
                else if(remainder.get(i) == 12) answer.add(i, "C");
                else if(remainder.get(i) == 13) answer.add(i, "D");
                else if(remainder.get(i) == 14) answer.add(i, "E");
                else if(remainder.get(i) == 15) answer.add(i, "F");
                else if(remainder.get(i) == 16) answer.add(i, "G");
                else if(remainder.get(i) == 17) answer.add(i, "H");
                else if(remainder.get(i) == 18) answer.add(i, "I");
                else if(remainder.get(i) == 19) answer.add(i, "J");
                else if(remainder.get(i) == 20) answer.add(i, "K");
                else if(remainder.get(i) == 21) answer.add(i, "L");
                else if(remainder.get(i) == 22) answer.add(i, "M");
                else if(remainder.get(i) == 23) answer.add(i, "N");
                else if(remainder.get(i) == 24) answer.add(i, "O");
                else if(remainder.get(i) == 25) answer.add(i, "P");
                else if(remainder.get(i) == 26) answer.add(i, "Q");
                else if(remainder.get(i) == 27) answer.add(i, "R");
                else if(remainder.get(i) == 28) answer.add(i, "S");
                else if(remainder.get(i) == 29) answer.add(i, "T");
                else if(remainder.get(i) == 30) answer.add(i, "U");
                else if(remainder.get(i) == 31) answer.add(i, "V");
                else if(remainder.get(i) == 32) answer.add(i, "W");
                else if(remainder.get(i) == 33) answer.add(i, "X");
                else if(remainder.get(i) == 34) answer.add(i, "Y");
                else if(remainder.get(i) == 35) answer.add(i, "Z");
            }
        }

        for(int i = answer.size()-1; i >=0;i--) {
            System.out.print(answer.get(i));
        }
    }
}
