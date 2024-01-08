import java.io.*;
import java.util.StringTokenizer;

public class 최대공약수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long ans = gcd(a,b);
        while(ans > 0) {
            bw.write("1");
            ans--;
        }
        bw.flush();
    }
    static long gcd(long a, long b) {
        if(b == 0) {
            return a;
        }
        else {
            return gcd(b, a%b);
        }
    }
}
