import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        number = number / 4;
        String string_long = "long";
        String string_int = "int";
        String whiteSpace = " ";

        String result = "";

        for(int i = 0 ; i < number; i++){
            result = result.concat(string_long);
            result = result.concat(whiteSpace);
        }

        result = result.concat(string_int);

        System.out.println(result);
    }
}