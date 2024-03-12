import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 기타리스트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] v = new int[n+1];
        int[][] dp = new int[n+1][m+1];
        int max = -1;
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++) {
            v[i] = Integer.parseInt(st.nextToken());
        }
        dp[0][s] = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j <= m; j++) {
                if(dp[i-1][j] == 1) {
                    if(j+v[i] <= m) {
                        dp[i][j+v[i]] = 1;
                    }
                    if(j-v[i] >= 0) {
                        dp[i][j-v[i]] = 1;
                    }
                }
            }
        }
        for(int i = 0; i <= m; i++) {
            if(dp[n][i] == 1) {
                max = Math.max(max, i);
            }
        }
        System.out.println(max);
    }
}