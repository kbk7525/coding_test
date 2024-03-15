import java.util.Scanner;
public class 피보나치수7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[1000001];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i < n+1; i++) {
            dp[i] = (dp[i-2]+dp[i-1])%1000000007;
        }
        System.out.println(dp[n]);
    }
}