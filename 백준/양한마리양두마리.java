import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 양한마리양두마리 {
    static int[][] arr;
    static boolean[][] visited;
    static int h;
    static int w;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            h = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            arr = new int[h][w];
            visited = new boolean[h][w];
            for(int j = 0; j < h; j++) {
                String s = br.readLine();
                for(int k = 0; k < w; k++) {
                    arr[j][k] = s.charAt(k);
                    if(arr[j][k] == '.') {
                        visited[j][k] = true;
                    }
                }
            }
            int ans = 0;
            for(int j = 0; j < h; j++) {
                for(int k = 0; k < w; k++) {
                    if(!visited[j][k]) {
                        ans++;
                        bfs(j,k);
                    }
                }
            }
            System.out.println(ans);
        }
    }
    static void bfs(int j, int k) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {j,k});
        visited[j][k] = true;
        while(!q.isEmpty()) {
            int[] tmp = q.poll();
            for(int i = 0; i < 4; i++) {
                int x = tmp[0] + dx[i];
                int y = tmp[1] + dy[i];
                if(x >= 0 && x < h && y >= 0 && y < w && !visited[x][y]) {
                    visited[x][y] = true;
                    q.add(new int[]{x,y});
                }
            }
        }
    }
}
