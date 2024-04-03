import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        while(input != -1) {
            ArrayList<Integer> factors = new ArrayList<>();
            int sum = 0;

            for(int i = 1; i < input; i++) {
                if(input%i == 0){
                    factors.add(i);
                    sum = sum + i;
                }
            }

            if(sum == input) {
                System.out.printf("%d = ", input);
                for(int i = 0; i < factors.size()-1; i++){
                    System.out.printf("%d + ",factors.get(i));
                }
                System.out.print(factors.get(factors.size()-1));
                System.out.println();
            }
            else {
                System.out.printf("%d is NOT perfect.\n", input);
            }

            input = Integer.parseInt(br.readLine());
        }
    }
}