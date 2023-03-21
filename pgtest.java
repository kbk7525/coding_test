public class pgtest {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(4));
    }
}
class Solution {
    public int[] solution(int n) {
        int len = 0;
        for(int i = 1; i <= n; i++) {
            len += i;
        }
        int[] answer = new int[len];
        int[][] tri = new int[n][n];
        int num = 1;
        int x = -1;
        int y = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                if(i % 3 == 0) {
                    x++;
                }
                else if(i % 3 == 1) {
                    y++;
                }
                else if(i % 3 == 2) {
                    x--;
                    y--;
                }
                tri[x][y] = num++;
            }
        }
        int idx = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(tri[i][j] == 0) {
                    break;
                }
                answer[idx] = tri[i][j];
                idx++;
            }
        }
        return answer;
    }
}