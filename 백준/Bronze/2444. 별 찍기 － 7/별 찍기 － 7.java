
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for(int i = 1; i <= num; i++){
            for(int j=num-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = num; i >=1 ;i--){
            for(int j = 0; j < num-i+1; j++){
                System.out.print(" ");
            }
            for(int j = 2*(i-1)-1; j>=1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}