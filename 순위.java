public class 순위 {
    public static void main(String[] args) {
        순위_Solution s = new 순위_Solution();
        int[][] results = {{4,3},{4,2},{3,2},{1,2},{2,5}};
        System.out.println(s.solution(5,results));
    }
}
class 순위_Solution {
    public int solution(int n, int[][] results) {
        int answer = 0;
        int[][] graph = new int[n+1][n+1];
        for(int i = 0; i < results.length; i++) {
            graph[results[i][0]][results[i][1]] = 1;
        }
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= n; j++) {
                for(int k = 0; k <= n; k++) {
                    if(graph[j][i] == 1 && graph[i][k] == 1) {
                        graph[j][k] = 1;
                    }
                }
            }
        }
        for(int i = 1; i <= n; i++) {
            int cnt = 0;
            for(int j = 1; j <= n; j++) {
                if(graph[i][j] == 1 || graph[j][i] == 1) {
                    cnt++;
                }
            }
            if(cnt == n-1) {
                answer++;
            }
        }
        return answer;
    }
}