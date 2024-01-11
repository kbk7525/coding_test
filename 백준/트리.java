import java.util.Scanner;
import java.util.ArrayList;

public class 트리 {
    static boolean[] visited;
    static ArrayList<Integer>[] tree;
    static int answer = 0;
    static int delete = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        visited = new boolean[n+1];
        tree = new ArrayList[n+1];
        int root = 0;
        for(int i = 0; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }
        for(int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if(num != -1) {
                tree[i].add(num);
                tree[num].add(i);
            }
            else {
                root = i;
            }
        }
        delete = scanner.nextInt();
        if(delete == root) {
            System.out.println(0);
        }
        else {
            dfs(root);
            System.out.println(answer);
        }
    }
    static void dfs(int a) {
        visited[a] = true;
        int child = 0;
        for(int i : tree[a]) {
            if(!visited[i] && i != delete) {
                child++;
                dfs(i);
            }
        }
        if(child == 0) {
            answer++;
        }
    }
}
