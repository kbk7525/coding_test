import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 제곱수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        int ans = -1;
        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            for(int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                for(int k = -n; k < n; k++) {
                    for(int l = -m; l < m; l++) {
                        if(k == 0 && l == 0) {
                            continue;
                        }
                        int ni = i;
                        int nj = j;
                        int now = 0;
                        while(ni >=0 && ni < n && nj >= 0 && nj < m) {
                            now *= 10;
                            now += arr[ni][nj];
                            int sq = (int) Math.sqrt(now);
                            if(sq*sq == now) {
                                ans = Math.max(ans, now);
                            }
                            ni += k;
                            nj += l;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}