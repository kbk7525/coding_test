import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 행렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;
        char[][] arrA = new char[n][m];
        char[][] arrB = new char[n][m];
        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            arrA[i] = s.toCharArray();
        }
        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            arrB[i] = s.toCharArray();
        }
        for(int i = 0; i < n-2; i++) {
            for(int j = 0; j < m-2; j++) {
                if(arrA[i][j] == arrB[i][j]) {
                    continue;
                }
                cnt++;
                //3*3 행렬을 돌면서 비교
                for(int k = i; k < i+3; k++) {
                    for(int l = j; l < j+3; l++) {
                        if(arrA[k][l] == '1') {
                            arrA[k][l] = '0';
                        }
                        else {
                            arrA[k][l] = '1';
                        }
                    }
                }
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(arrA[i][j] != arrB[i][j]) {
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(cnt);
    }
}