import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 친구 {
    static int n;
    static char[][] arr;
    static boolean[] visited;
    static int max;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new char[n][n];
        for(int i = 0; i < n; i++) {
            arr[i] = br.readLine().toCharArray();
        }
        for(int i = 0; i < n; i++) {
            visited = new boolean[n];
            visited[i] = true;
            int d = 0;
            int cnt = 0;
            Queue<Integer> q = new LinkedList<>();
            q.add(i);
            while(d < 2) {
                int size = q.size();
                for(int j = 0; j < size; j++) {
                    int cur = q.poll();
                    for(int k = 0; k < n; k++) {
                        if(arr[cur][k] == 'Y' && !visited[k]) {
                            q.add(k);
                            visited[k] = true;
                            cnt++;
                        }
                    }
                }
                d++;
            }
            if(max < cnt) {
                max = cnt;
            }
        }
        System.out.println(max);
    }
}