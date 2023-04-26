public class week05_3 {
    public static void main(String[] args) {
        w5_3_Solution s = new w5_3_Solution();
        int[][] puddles = {{2,2}};
        System.out.println(s.solution(4,3,puddles));
    }
}
class w5_3_Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] road = new int[n+1][m+1];
        //웅덩이
        for(int i = 0; i < puddles.length; i++) {
            road[puddles[i][1]][puddles[i][0]] = -1;
        }
        //스타트
        road[1][1] = 1;
        for(int i = 1; i < road.length; i++) {
            for(int j = 1; j < road[i].length; j++) {
                //웅덩이 만나면
                if(road[i][j] == -1) {
                    continue;
                }
                //왼쪽에서 오는 경우
                if(road[i-1][j] > 0) {
                    road[i][j] += road[i-1][j] % 1000000007;
                }
                //위쪽에서 오는 경우
                if(road[i][j-1] > 0) {
                    road[i][j] += road[i][j-1] % 1000000007;
                }
            }
        }
        return road[n][m] % 1000000007;
    }
}