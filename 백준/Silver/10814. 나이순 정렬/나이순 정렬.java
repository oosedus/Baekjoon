import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        String[][] input = new String[num][2];

        for(int i = 0; i < num; i++){
            String[] info = sc.nextLine().split(" ");
            input[i][0] = info[0];
            input[i][1] = info[1];
        }
        String[][] result = new String[num][2];

        mergeSort(input, result,0, input.length-1);
        printResult(input);

    }

    public static void mergeSort(String[][] arr, String[][] result, int start, int end){
        if (start < end) {
            int middle = (start+end)/2;

            mergeSort(arr, result, start, middle); // 좌측 배열 분할
            mergeSort(arr, result, middle+1, end); // 우측 배열 분할
            merge(arr, result, start, middle, end); // 합병
        }
    }

    public static void merge(String[][] arr, String[][] result, int start, int middle, int end){
        int left = start;
        int right = middle+1;
        int idx = start;

        while((left <= middle) && (right <= end)){
            if(Integer.parseInt(arr[left][0]) <= Integer.parseInt(arr[right][0])){
                result[idx][0] = arr[left][0];
                result[idx][1] = arr[left][1];
                left++;
            }
            else {
                result[idx][0] = arr[right][0];
                result[idx][1] = arr[right][1];
                right++;
            }
            idx++;
        }
        if(left > middle){
            for(int i = right; i <= end; i++){
                result[idx][0] = arr[i][0];
                result[idx][1] = arr[i][1];
                idx++;
            }
        }
        else {
            for(int i = left; i <= middle; i++){
                result[idx][0] = arr[i][0];
                result[idx][1] = arr[i][1];
                idx++;
            }
        }
        for(int i = start; i <= end; i++){
            arr[i][0] = result[i][0];
            arr[i][1] = result[i][1];
        }
    }

    public static void printResult(String[][] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
