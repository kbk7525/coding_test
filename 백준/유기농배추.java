import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 유기농배추 {
    static boolean[][] visited;
    static int[][] arr;
    static int m;
    static int n;
    static int k;
    static int[] dx = {0,-1,0,1};
    static int[] dy = {1,0,-1,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            arr = new int[m][n];
            visited = new boolean[m][n];
            k = Integer.parseInt(st.nextToken());
            int cnt = 0;
            for(int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[x][y] = 1;
            }
            for(int j = 0; j < m; j++) {
                for(int l = 0; l < n; l++) {
                    if(arr[j][l] == 1 && !visited[j][l]) {
                        dfs(j, l);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
    static void dfs(int i, int j){
        visited[i][j] = true;
        for(int k = 0; k < 4; k++) {
            int nx = i + dx[k];
            int ny = j + dy[k];
            if(nx >= 0 && nx < m && ny >= 0 && ny < n) {
                if(!visited[nx][ny] && arr[nx][ny] == 1) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
