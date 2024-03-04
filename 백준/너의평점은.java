import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 너의평점은 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[20];
        double total = 0.0;
        double sum = 0.0;
        String[] grade = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double[] score = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};
        for(int i = 0; i < 20; i++) {
            str[i] = br.readLine();
            StringTokenizer st = new StringTokenizer(str[i], " ");
            String s = st.nextToken();
            double sco = Double.parseDouble(st.nextToken());
            String g = st.nextToken();
            for(int j = 0; j < 10; j++) {
                if(g.equals(grade[j])) {
                    total += sco*score[j];
                    if(j != 9) {
                        sum += sco;
                    }
                }
            }
        }
        double avg = total/sum;
        System.out.printf("%.6f", avg);
    }
}
