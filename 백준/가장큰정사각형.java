import java.util.Scanner;
public class 가장큰정사각형 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long[][] dp = new long[1001][1001];
        long max = 0;
        for(int i = 0; i < n; i++) {
            String s = scanner.next();
            for(int j = 0; j < m; j++) {
                dp[i][j] = Long.parseLong(String.valueOf(s.charAt(j)));
                if(dp[i][j] == 1 && j > 0 && i > 0) {
                    dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]))+dp[i][j];
                }
                if(dp[i][j] > max) {
                    max = dp[i][j];
                }
            }
        }
        System.out.println(max*max);
    }
}