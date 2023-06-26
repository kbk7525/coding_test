public class ps_w06_4 {
    public static void main(String[] args) {
        ps_w06_4_Solution s = new ps_w06_4_Solution();
        System.out.println(s.solution(4));
    }
}
class ps_w06_4_Solution {
    public int solution(int n) {
        int[] dp = new int[60000];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 2;
        dp[3] = 3;
        for(int i = 4; i < dp.length; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 1000000007;
        }
        return dp[n];
    }
}
