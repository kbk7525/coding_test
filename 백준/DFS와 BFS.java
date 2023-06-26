import java.util.*;
public class boj_1260 {
    static int[][] node;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();
        node = new int[n+1][n+1];
        visited = new boolean[n+1];
        for(int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            node[a][b] = 1;
            node[b][a] = 1;
        }
        dfs(v);
        for(int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        System.out.println();
        bfs(v);
    }

    static void dfs(int v) {
        if(visited[v] == true) {
            return;
        }
        visited[v] = true;
        System.out.print(v + " ");
        for(int i = 1; i < node.length; i++) {
            if(node[v][i] == 1) {
                dfs(i);
            }
        }
    }

    static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        visited[v] = true;
        while(!q.isEmpty()) {
            v = q.poll();
            System.out.print(v + " ");
            for(int i = 1; i < node.length; i++) {
                if(node[v][i] == 1 && visited[i] == false) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
