import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double[] num = new double[20];
        double[] grade = new double[20];
        double sum = 0;
        double numSum = 0;

        for(int i = 0; i < 20; i++){
            String[] tmp = br.readLine().split(" ");
            num[i] = Double.parseDouble(tmp[1]);

            for(int j = 0; j < grade.length; j++) {
                if(tmp[2].equals("A+")) {
                    sum += num[i]*4.5;
                    numSum += num[i];
                }
                if(tmp[2].equals("A0")) {
                    sum += num[i]*4.0;
                    numSum += num[i];
                }
                if(tmp[2].equals("B+")) {
                    sum += num[i]*3.5;
                    numSum += num[i];
                }
                if(tmp[2].equals("B0")) {
                    sum += num[i]*3.0;
                    numSum += num[i];
                }
                if(tmp[2].equals("C+")) {
                    sum += num[i]*2.5;
                    numSum += num[i];
                }
                if(tmp[2].equals("C0")) {
                    sum += num[i]*2.0;
                    numSum += num[i];
                }
                if(tmp[2].equals("D+")) {
                    sum += num[i]*1.5;
                    numSum += num[i];
                }
                if(tmp[2].equals("D0")) {
                    sum += num[i]*1.0;
                    numSum += num[i];
                }
                if(tmp[2].equals("F")) {
                    sum += num[i]*0.0;
                    numSum += num[i];
                }
                if(tmp[2].equals("P")) {
                    continue;
                }
            }
        }

        System.out.println(sum/numSum);
    }
}