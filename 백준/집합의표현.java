import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 집합의표현 {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n+1];
        for(int i = 0; i <= n; i++) {
            arr[i] = i;
        }
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(num == 0) {
                union(a, b);
            }
            else {
                if(check(a, b)) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
        }
    }
    static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if(a != b) {
            arr[b] = a;
        }
    }
    static boolean check(int a, int b) {
        a = find(a);
        b= find(b);
        return a == b;
    }
    static int find(int a) {
        if(a == arr[a]) {
            return a;
        }
        else {
            return arr[a] = find(arr[a]);
        }
    }
}
