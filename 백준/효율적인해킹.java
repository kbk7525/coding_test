import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 효율적인해킹 {
    static boolean[] visited;
    static ArrayList<Integer>[] arr;
    static int[] ans;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        ans = new int[n+1];
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
        for(int i = 1; i <= n; i++) {
            visited = new boolean[n+1];
            bfs(i);
        }
        int max = 0;
        for(int i = 1; i <= n; i++) {
            max = Math.max(max, ans[i]);
        }
        for(int i = 1; i <= n; i++) {
            if(ans[i] == max) {
                bw.write(i + " ");
            }
        }
        bw.flush();
    }
    static void bfs(int a) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(a);
        visited[a] = true;
        while(!queue.isEmpty()) {
            int n = queue.poll();
            for(int i : arr[n]) {
                if(visited[i]) {
                    continue;
                }
                visited[i] = true;
                ans[i]++;
                queue.add(i);
            }
        }
    }
}