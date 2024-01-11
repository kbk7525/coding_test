import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 트리의부모찾기 {
    static boolean[] visited;
    static int[] arr;
    static ArrayList<Integer>[] tree;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        visited = new boolean[n+1];
        arr = new int[n+1];
        tree = new ArrayList[n+1];
        for(int i = 0; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }
        for(int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            tree[a].add(b);
            tree[b].add(a);
        }
        dfs(1);
        for(int i = 2; i <= n; i++) {
            System.out.println(arr[i]);
        }
    }
    static void dfs(int a) {
        visited[a] = true;
        for(int i : tree[a]) {
            if(!visited[i]) {
                arr[i] = a;
                dfs(i);
            }
        }
    }
}
