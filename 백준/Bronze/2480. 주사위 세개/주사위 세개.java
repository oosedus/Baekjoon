import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        
        if(a == b && b == c && c == a) System.out.println(10000+a*1000);
        if(a != b && b != c && c != a) {
            int max = Math.max(a,Math.max(b,c));
            System.out.println(max*100);
        }
        if(a == b && b != c && c != a){
            System.out.println(1000+a*100);
        }
        if(a != b && b == c && c != a){
            System.out.println(1000+b*100);
        }
        if(a != b && b != c && c == a){
            System.out.println(1000+c*100);
        }
    }
}