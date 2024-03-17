import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer numbers[] = new Integer[10];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(br.readLine())%42;
        }

        Set<Integer> set = new HashSet<Integer>(Arrays.asList(numbers));

        System.out.println(set.size());
    }
}