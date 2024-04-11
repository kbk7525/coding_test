import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 부분수열의합 {
    static int n,s,cnt;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        arr = new int[n];
        cnt = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0,0);
        if(s == 0 ) {
            System.out.println(cnt-1);
            return;
        }
        System.out.println(cnt);
    }
    static void dfs(int i, int sum) {
        if(i == n) {
            if(sum == s) {
                cnt++;
            }
            return;
        }
        dfs(i+1, sum+arr[i]);
        dfs(i+1, sum);
    }
}