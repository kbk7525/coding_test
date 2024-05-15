import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 신나는함수실행 {
    static int[][][] arr = new int[21][21][21];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a == -1 && b == -1 && c == -1) {
                break;
            }
            System.out.print("w(" + a + ", " + b + ", " + c + ") = " );
            System.out.println(dp(a, b, c));
        }
    }
    static int dp(int a, int b, int c) {
        if(range(a,b,c) && arr[a][b][c] != 0) {
            return arr[a][b][c];
        }
        else if(a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }
        else if(a > 20 || b > 20 || c > 20) {
            return arr[20][20][20] = dp(20, 20, 20);
        }
        else if(a < b && b < c) {
            return arr[a][b][c] = dp(a, b, c-1) + dp(a, b-1, c-1) - dp(a, b-1, c);
        }
        else {
            return arr[a][b][c] = dp(a-1, b, c) + dp(a-1, b-1, c) + dp(a-1, b, c-1) - dp(a-1, b-1, c-1);
        }
    }
    static boolean range(int a, int b, int c) {
        if(0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20) {
            return true;
        }
        return false;
    }
}
