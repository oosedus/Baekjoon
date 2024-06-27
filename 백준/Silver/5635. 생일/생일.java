import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String[][] input = new String[num][2];

        for(int i = 0 ; i < num; i++){
            String[] tmpInput = sc.nextLine().split(" ");
            String dd = tmpInput[1];
            String mm = tmpInput[2];
            if(dd.length() == 1){
                dd = 0 + dd;
            }
            if(mm.length() == 1){
                mm = 0 + mm;
            }
            
            String birthday = tmpInput[3] + mm + dd;
            input[i][0] = tmpInput[0];
            input[i][1] = birthday;
        }

        Arrays.sort(input, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int a = Integer.parseInt(o1[1]);
                int b = Integer.parseInt(o2[1]);
                return a-b;
            }
        });

        System.out.println(input[input.length-1][0]);
        System.out.println(input[0][0]);
        }

}
