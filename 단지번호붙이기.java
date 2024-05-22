import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 단지번호붙이기 {
    static boolean[][] visited;
    static int[][] arr;
    static int n;
    static int cnt;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};
    static List<Integer> list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        list = new ArrayList<>();
        cnt = 1;
        visited = new boolean[n][n];
        arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            for(int j = 0; j < s.length(); j++) {
                arr[i][j] = s.charAt(j)-'0';
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j] == 1 && !visited[i][j]) {
                    dfs(i, j);
                    list.add(cnt);
                    cnt = 1;
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for (int i : list) {
            System.out.println(i);
        }
    }
    static void dfs(int i, int j) {
        visited[i][j] = true;
        for(int k = 0; k < 4; k++) {
            int nx = i + dx[k];
            int ny = j + dy[k];
            if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
                if(arr[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx, ny);
                    cnt++;
                }
            }
        }
    }
}