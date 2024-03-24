import java.util.Scanner;
public class 순열사이클 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int cnt = 0;
            int n = sc.nextInt();
            int[] arr = new int[n+1];
            boolean[] visited = new boolean[n+1];
            for(int j = 1; j <= n; j++) {
                arr[j] = sc.nextInt();
            }
            for(int j = 1; j <= n; j++) {
                if(!visited[j]) {
                    visited[j] = true;
                    int node = arr[j];
                    while(true) {
                        if(visited[node]) {
                            cnt++;
                            break;
                        }
                        visited[node] = true;
                        node = arr[node];
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}