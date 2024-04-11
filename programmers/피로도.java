public class 피로도 {
}
class Solution14 {
    static int answer = 0;
    static boolean[] visited;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(0, dungeons ,k);
        return answer;
    }
    void dfs(int cnt, int[][] arr, int k) {
        for(int i = 0; i < arr.length; i++) {
            if(visited[i] || arr[i][0] > k) {
                continue;
            }
            visited[i] = true;
            dfs(cnt+1, arr, k-arr[i][1]);
            visited[i] = false;
        }
        answer = Math.max(cnt, answer);
    }
}