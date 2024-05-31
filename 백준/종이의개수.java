import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 종이의개수 {
    static int cnt1 = 0;
    static int cnt2 = 0;
    static int cnt3 = 0;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        solve(0,0,n);
        System.out.println(cnt1);
        System.out.println(cnt2);
        System.out.println(cnt3);
    }

    static void solve(int r, int c, int size) {
        if(check(r,c,size)) {
            if(arr[r][c] == -1) {
                cnt1++;
            }
            else if(arr[r][c] == 0) {
                cnt2++;
            }
            else if(arr[r][c] == 1) {
                cnt3++;
            }
            return;
        }
        int nSize = size/3;
        solve(r, c, nSize);
        solve(r, c+nSize, nSize);
        solve(r, c+2*nSize, nSize);
        solve(r+nSize, c, nSize);
        solve(r+nSize, c+nSize, nSize);
        solve(r+nSize, c+2*nSize, nSize);
        solve(r+2*nSize, c, nSize);
        solve(r+2*nSize, c+nSize, nSize);
        solve(r+2*nSize, c+2*nSize, nSize);
    }

    static boolean check(int r, int c, int size) {
        int num = arr[r][c];
        for(int i = r; i < r + size; i++) {
            for(int j = c; j < c + size; j++) {
                if(num != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
