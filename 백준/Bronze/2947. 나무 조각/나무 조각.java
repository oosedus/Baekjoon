import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
        int[] input = new int[5];
        int[] answer = {1,2,3,4,5};

        for(int i=0; i < 5; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }

        while(!Arrays.equals(input, answer)){
            for(int i = 0; i < 4; i++){
                if(input[i] > input[i+1]) {
                    swap(input, i);
                    printArray(input);
                }
            }
        }
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int[] swap(int[] arr, int index){
        int tmp = arr[index];
        arr[index] = arr[index+1];
        arr[index+1] = tmp;
        return arr;
    }
}
