import java.util.Scanner;
public class 줄어들지않아 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long cnt = 0;
            long[][] dp = new long[n+1][10];
            for(int j = 0; j < 10; j++) {
                dp[1][j] = 1;
            }
            for(int j = 0; j <= n; j++) {
                dp[j][0] = 1;
            }
            for(int j = 2; j <= n; j++) {
                for(int k = 1; k < 10; k++) {
                    dp[j][k] = dp[j-1][k]+dp[j][k-1];
                }
            }
            for(long num : dp[n]) {
                cnt += num;
            }
            System.out.println(cnt);
        }
    }
}