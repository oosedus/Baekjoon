import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input[] = new int[9];


        for(int i = 0; i < 9; i++){
            input[i] = sc.nextInt();
        }

        int a = 0, b = 0;
        int totalSum = Arrays.stream(input).sum();
        boolean found = false;

        for(int i = 0; i < 8; i++){
            for(int j = i+1; j < 9; j++){
                int sum =  totalSum - input[i] - input[j];
                if(sum==100){
                    a = i;
                    b = j;
                    found = true;
                    break;
                }
            }
            if(found) break;
        }


        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < 9; i++){
            if(i == a || i == b) continue;
            else result.add(input[i]);
        }


        result = selectionSort(result);

        for(int i = 0; i < 7; i++){
            System.out.println(result.get(i));
        }

    }

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> result){
        for(int i = 0; i < result.size()-1; i++){
            int minIdx = i;
            for(int j = i+1; j < result.size(); j++){
                if(result.get(minIdx) >= result.get(j)) minIdx = j;
            }
            int tmp = result.get(minIdx);
            result.set(minIdx, result.get(i));
            result.set(i, tmp);
        }
        return result;
    }

}
