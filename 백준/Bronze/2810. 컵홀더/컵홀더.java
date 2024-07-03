import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();

        String result = "*";
        if(!(input.contains("L"))) System.out.println(N);
        else {
            String[] tmp = input.split("");
            for(int i = 0; i < tmp.length; i++){
                if(tmp[i].equals("S")) result += "*";
                else {
                    result += "*";
                    i++;
                }
            }
            System.out.println(result.length());
        }

    }

}
