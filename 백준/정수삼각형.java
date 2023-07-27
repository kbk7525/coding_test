package boj;

import java.util.*;
public class 정수삼각형 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int[][] tri = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				tri[i][j] = sc.nextInt();
			}
		}
		int[][] dp = new int[n][n];
		dp[0][0] = tri[0][0];
		for(int i = 1; i < n; i++) {
			//왼쪽
			dp[i][0] = dp[i-1][0] + tri[i][0];
			//중간
			for(int j = 1; j <= i; j++) {
				dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-1])+tri[i][j];
			}
			//오른쪽
			dp[i][i] = dp[i-1][i-1]+tri[i][i];
		}
		for(int i = 0; i < n; i++) {
			ans = Math.max(ans, dp[n-1][i]);
		}
		System.out.println(ans);
	}
}