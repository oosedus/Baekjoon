
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        String[] N = input[0].split("");
        int num = Integer.parseInt(input[1]);

        for(int i = 0; i < N.length; i++) {
            switch (N[i]) {
                case "A":
                    N[i] = "10";
                    break;
                case "B":
                    N[i] = "11";
                    break;
                case "C":
                    N[i] = "12";
                    break;
                case "D":
                    N[i] = "13";
                    break;
                case "E":
                    N[i] = "14";
                    break;
                case "F":
                    N[i] = "15";
                    break;
                case "G":
                    N[i] = "16";
                    break;
                case "H":
                    N[i] = "17";
                    break;
                case "I":
                    N[i] = "18";
                    break;
                case "J":
                    N[i] = "19";
                    break;
                case "K":
                    N[i] = "20";
                    break;
                case "L":
                    N[i] = "21";
                    break;
                case "M":
                    N[i] = "22";
                    break;
                case "N":
                    N[i] = "23";
                    break;
                case "O":
                    N[i] = "24";
                    break;
                case "P":
                    N[i] = "25";
                    break;
                case "Q":
                    N[i] = "26";
                    break;
                case "R":
                    N[i] = "27";
                    break;
                case "S":
                    N[i] = "28";
                    break;
                case "T":
                    N[i] = "29";
                    break;
                case "U":
                    N[i] = "30";
                    break;
                case "V":
                    N[i] = "31";
                    break;
                case "W":
                    N[i] = "32";
                    break;
                case "X":
                    N[i] = "33";
                    break;
                case "Y":
                    N[i] = "34";
                    break;
                case "Z":
                    N[i] = "35";
                    break;
                default:
                    continue;
            }
        }

        int[] number = new int[N.length];


        for(int i = 0; i < N.length; i++){
            number[i] = Integer.parseInt(N[i]);
        }

        int answer = 0;
        int tmp = 0;
        for(int i = number.length-1; i >= 0; i--) {
            answer += number[i]*(Math.pow(num,tmp));
            tmp++;
        }

        System.out.println(answer);
    }
}