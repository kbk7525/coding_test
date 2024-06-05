import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 촌수계산 {
    static int[][] arr;
    static int[] chon;
    static int n, m;
    static int p1;
    static int p2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n+1][n+1];
        chon = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        p1 = Integer.parseInt(st.nextToken());
        p2 = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(br.readLine());
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y] = 1;
            arr[y][x] = 1;
        }
        bfs(p1);

        if(chon[p2] == 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(chon[p2]);
        }
    }
    static void bfs(int p){
        Queue<Integer> q = new LinkedList<>();
        q.add(p);
        while(!q.isEmpty()){
            int t = q.poll();
            if(t == p2){
                break;
            }
            for(int i = 1; i <= n; i++){
                if(arr[t][i] == 1 && chon[i] == 0){
                    q.add(i);
                    chon[i] = chon[t]+1;
                }
            }
        }
    }
}