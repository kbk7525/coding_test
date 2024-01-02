import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탐색 {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int[][] arr;
    static boolean[][] visited;
    static int n;
    static int m;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visited = new boolean[n][m];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            for(int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(s.substring(j, j+1));
            }
        }
        bfs(0,0);
        System.out.println(arr[n-1][m-1]);
    }
    static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x,y});
        visited[x][y] = true;
        while(!queue.isEmpty()) {
            int [] now = queue.poll();
            for(int i = 0; i < 4; i++) {
                int nx = now[0]+dx[i];
                int ny = now[1]+dy[i];
                if(nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if(arr[nx][ny] != 0 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        arr[nx][ny] = arr[now[0]][now[1]]+1;
                        queue.add(new int[] {nx, ny});
                    }
                }
            }
        }
    }
}