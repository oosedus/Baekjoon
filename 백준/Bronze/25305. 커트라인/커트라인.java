import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Integer[] x = new Integer[N]; // reverse를 위해 wrapper class 사용

        int i = 0;
        st = new StringTokenizer(sc.nextLine(), " ");


        while (st.hasMoreTokens()){
            x[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        Arrays.sort(x, Collections.reverseOrder());

        System.out.println(x[k-1]);
    }
}
