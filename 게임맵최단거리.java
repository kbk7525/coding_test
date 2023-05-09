import java.util.*;

public class 게임맵최단거리 {
    public static void main(String[] args) {
        게임맵최단거리_Solution s = new 게임맵최단거리_Solution();
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        System.out.println(s.solution(maps));
    }
}
class 게임맵최단거리_Solution {
    int[] dx = {1,0,-1,0}; //좌우
    int[] dy = {0,1,0,-1}; //상하
    public int solution(int[][] maps) {
        int answer = 0;
        int[][] visited = new int[maps.length][maps[0].length];
        bfs(maps, visited);
        answer = visited[maps.length-1][maps[0].length-1];
        if(answer == 0) {
            return -1;
        }
        return answer;
    }
    void bfs(int[][] maps, int[][] visited) {
        int x = 0;
        int y = 0;
        visited[x][y] = 1; //처음 시작점
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});
        while(!q.isEmpty()) {
            int[] cur = q.remove(); //현재 위치
            int cx = cur[0];
            int cy = cur[1];
            for(int i = 0; i < dx.length; i++) {
                int ax = cx + dx[i];
                int ay = cy + dy[i];
                //맵을 벗어낫을 경우
                if(ax < 0 || ay < 0 || ax > maps.length-1 || ay > maps[0].length-1) {
                    continue;
                }
                //방문하지 않았고 맵에서 벽이 없으면
                if(visited[ax][ay] == 0 && maps[ax][ay] == 1) {
                    visited[ax][ay] = visited[cx][cy]+1;
                    //큐에 넣어줌
                    q.add(new int[]{ax, ay});
                }
            }
        }
    }
}