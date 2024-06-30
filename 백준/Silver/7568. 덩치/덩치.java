import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int[][] input = new int[N][2];
        int[] result = new int[N];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
            input[i][0] = Integer.parseInt(st.nextToken());
            input[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++){
            int k = 1;
            for(int j = 0; j < N; j++){
                if((input[i][0] < input[j][0]) && (input[i][1] < input[j][1])){
                    k++;
                }
            }
            result[i] = k;
        }

        printArray(result);
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
