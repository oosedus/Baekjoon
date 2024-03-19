import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        float[] score = new float[input.length];

        for(int i = 0; i < input.length; i++){
            score[i] = Float.parseFloat(input[i]);
        }

        float max = 0;
        float sum = 0;

        for(float i:score){
            if(i > max){
                max = i;
            }
        }

        for(int i = 0; i < score.length; i++){
            score[i] = (score[i]/max)*100;
            sum = sum + score[i];
        }

        System.out.println(sum/ score.length);
    }
}