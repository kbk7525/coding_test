import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Z {
    static int n, r, c, count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        cnt(0,0, (int)Math.pow(2,n));
    }
    static void cnt(int R, int C, int s) {
        if(s == 1) {
            System.out.println(count);
            return;
        }
        int size = s/2;
        if(r < R+size && c < C+size) {
            cnt(R, C, size);
        }
        if(r < R+size && C+size <= c) {
            count += ((int) Math.pow(s, 2))/4;
            cnt(R, C+size, size);
        }
        if(R+size <= r && c < C+size) {
            count += (((int) Math.pow(s, 2))/4)*2;
            cnt(R+size, C, size);
        }
        if(R+size <= r && C+size <= c) {
            count += (((int) Math.pow(s, 2))/4)*3;
            cnt(R+size, C+size, size);
        }
    }
}