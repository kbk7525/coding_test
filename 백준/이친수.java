import java.util.Scanner;
public class 이친수 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[][] dp = new long[n+1][2];
        dp[1][1] = 1;
        dp[1][0] = 0;
        for(int i = 2; i <= n; i++) {
            dp[i][0] = dp[i-1][0] + dp[i-1][1];
            dp[i][1] = dp[i-1][0];
        }
        System.out.println(dp[n][0] + dp[n][1]);
    }
}