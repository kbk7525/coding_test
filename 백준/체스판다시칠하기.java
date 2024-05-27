import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 체스판다시칠하기 {
    static boolean [][] arr;
    static int min = 64;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new boolean[n][m];
        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            for(int j = 0; j < m; j++) {
                if(str.charAt(j) == 'W') {
                    arr[i][j] = true;
                }
                else {
                    arr[i][j] = false;
                }
            }
        }
        int row = n-7;
        int col = m-7;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                count(i, j);
            }
        }
        System.out.println(min);
    }

    static void count(int x, int y) {
        int nx = x+8;
        int ny = y+8;
        int cnt = 0;
        boolean check = arr[x][y];
        for(int i = x; i < nx; i++) {
            for(int j = y; j < ny; j++) {
                if(arr[i][j] != check) {
                    cnt++;
                }
                check = !check;
            }
            check = !check;
        }
        cnt = Math.min(cnt, 64-cnt);
        min = Math.min(min, cnt);
    }
}
