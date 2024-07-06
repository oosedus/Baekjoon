import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        StringTokenizer tokenizer = new StringTokenizer(scanner.nextLine());
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(tokenizer.nextToken());
        }

        Arrays.sort(array);

        int M = Integer.parseInt(scanner.nextLine());
        tokenizer = new StringTokenizer(scanner.nextLine());

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(tokenizer.nextToken());
            System.out.println(binarySearch(array, num));
        }

    }

    private static int binarySearch(int[] array, int num) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (array[mid] == num) {
                return 1;
            } else if (array[mid] < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return 0;
    }
}
