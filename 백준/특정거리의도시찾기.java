import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 특정거리의도시찾기 {
    static int[] visited;
    static ArrayList<Integer>[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> ans = new ArrayList<>();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        arr = new ArrayList[n+1];
        for(int i = 1; i <= n; i++) {
            arr[i] = new ArrayList<>();
        }
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
        }
        visited = new int[n+1];
        for(int i = 0; i <= n; i++) {
            visited[i] = -1;
        }
        bfs(x);
        for(int i = 0; i <= n; i++) {
            if(visited[i] == k) {
                ans.add(i);
            }
        }
        if(ans.isEmpty()) {
            System.out.println(-1);
        }
        else {
            Collections.sort(ans);
            for(int i : ans) {
                System.out.println(i);
            }
        }
    }
    static void bfs(int a) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(a);
        visited[a]++;
        while(!queue.isEmpty()) {
            int n = queue.poll();
            for(int i : arr[n]) {
                if(visited[i] == -1) {
                    visited[i] = visited[n]+1;
                    queue.add(i);
                }
            }
        }
    }
}
