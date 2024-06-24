import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<>();

        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            input.add(sc.nextInt());
        }

        ArrayList<Integer> result = selectionSort(input);

        for(int i = 0; i < result.size(); i++){
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
