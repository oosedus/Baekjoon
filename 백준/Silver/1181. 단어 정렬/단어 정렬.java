import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String[] input = new String[num];

        for(int i = 0 ; i < num; i++){
            input[i] = sc.nextLine();
        }

        Set<String> tmp = new HashSet<>(Arrays.asList(input));
        String[] arr = tmp.toArray(new String[0]); // 배열의 크기를 0으로 지정하면 자동으로 배열 크기 지정된다.

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        int idx = 0;
        ArrayList<String> sameLengthWords = new ArrayList<>();

        for(int i = 0; i < arr.length-1;i++){
            if(arr[i].length() == arr[i+1].length()){
                sameLengthWords.add(arr[i]);
            } else {
                if(sameLengthWords.isEmpty()){
                    idx++;
                    continue;
                } else {
                    sameLengthWords.add(arr[i]);
                    String[] tmpArr = sameLengthWords.toArray(new String[sameLengthWords.size()]);
                    Arrays.sort(tmpArr);
                    for(int j = 0; j < tmpArr.length; j++){
                        arr[idx] = tmpArr[j];
                        idx++;
                    }
                    sameLengthWords.clear();
                }
            }
            }
        if(sameLengthWords.isEmpty()!=true){
            sameLengthWords.add(arr[arr.length-1]);
            String[] tmpArr = sameLengthWords.toArray(new String[sameLengthWords.size()]);
            Arrays.sort(tmpArr);
            for(int j = 0; j < tmpArr.length; j++){
                arr[idx] = tmpArr[j];
                idx++;
            }
        }
        printResult(arr);
        }

    public static void printResult(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
