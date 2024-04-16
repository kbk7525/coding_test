import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumSubarray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n+1];
            int[] dp = new int[n+1];
            int max = -999999999;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                dp[j] = dp[j - 1] + arr[j];
                max = Math.max(max, Math.max(dp[j], arr[j]));
            }
            for(int j = 1; j <= n; j++) {
                for(int k = n; k > j; k--) {
                    max = Math.max(max, (dp[k]-dp[j]));
                }
            }
            System.out.println(max);
        }
    }
}