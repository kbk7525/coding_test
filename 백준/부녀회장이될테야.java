package boj;

import java.util.Scanner;

public class 부녀회장이될테야 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int T = sc.nextInt();
        int[][] dp = new int[15][15];
        
      for(int i = 0; i < 15; i++){
            dp[0][i] = i + 1;
            dp[i][0] = 1;
        }
            
        for(int j = 1; j < 15; j++){
            for(int k = 1; k < 15; k++){
                dp[j][k] = dp[j-1][k] + dp[j][k-1];
            }
        }
        
        for(int j = 0; j < T; j++){
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(dp[k][n-1]);
        }
   }
}