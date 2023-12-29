import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 연결요소의개수 {
    static boolean[] visited;
    static ArrayList<Integer>[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new ArrayList[n+1];
        visited = new boolean[n+1];
        int cnt = 0;
        for(int i = 1; i < n+1; i++) {
            arr[i] = new ArrayList<>();
        }
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arr[s].add(e);
            arr[e].add(s);
        }
        for(int i = 1; i < n+1; i++) {
            if(!visited[i]) {
                cnt++;
                dfs(i);
            }
        }
        System.out.println(cnt);
    }
    static void dfs(int v) {
        if(visited[v]) {
            return;
        }
        visited[v] = true;
        for(int i : arr[v]) {
            if(visited[i] == false) {
                dfs(i);
            }
        }
    }
}
