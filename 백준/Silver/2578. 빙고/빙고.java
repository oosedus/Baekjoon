import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] input = new int[5][5];
        int[] nums = new int[25];

        for(int i = 0 ; i < 5; i++){
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            for(int j = 0; j < 5; j++){
                input[i][j] = Integer.parseInt(st.nextToken(" "));
            }
        }

        int tmp = 0;
        for(int i = 0 ; i < 5; i++){
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            for(int j = 0; j < 5; j++){
                nums[tmp] = Integer.parseInt(st.nextToken(" "));
                tmp++;
            }
        }

        int result = 0;

        for(int num: nums){
            int bingo = 0;
            result++;

            for(int i = 0; i < 5; i++){
                for(int j = 0 ; j < 5; j++){
                    if(input[i][j] == num) input[i][j] = 0;
                }
            }

            for(int i = 0; i < 5; i++){
                if(checkRowZero(input[i])) {
                    bingo++;
                }
                if(checkColumnZero(input, i)){
                    bingo++;
                }
            }

            if(checkDiagonalZero1(input)) {
                bingo++;
            }
            if(checkDiagonalZero2(input)) {
                bingo++;
            }

            if(checkBingo(bingo)){
                System.out.println(result);
                break;
            }

        }

    }

    public static boolean checkRowZero(int[] arr){
        for(int i = 0 ; i < 5 ; i++){
            if(arr[i] != 0 ) return false;
        }
        return true;
    }

    public static boolean checkColumnZero(int[][] arr, int i){
        if(arr[0][i] != 0) return false;
        if(arr[1][i] != 0) return false;
        if(arr[2][i] != 0) return false;
        if(arr[3][i] != 0) return false;
        return arr[4][i] == 0;
    }

    public static boolean checkDiagonalZero1(int[][] arr){
        for(int i = 0; i < 5; i++){
            if(arr[i][i] != 0) return false;
        }
        return true;
    }

    public static boolean checkDiagonalZero2(int[][] arr){
        for(int i = 0; i < 5; i++){
            if(arr[i][4-i] != 0) return false;
        }
        return true;
    }

    public static boolean checkBingo(int num){
        return num >= 3;
    }

}
