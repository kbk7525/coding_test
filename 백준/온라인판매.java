import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 온라인판매 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[m];
        int[] sum = new int[m];
        int max = 0;
        int idx = 0;
        for(int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for (int i = 0; i < m; i++) {
            if(m > n) { // 사람이 달걀 갯수보다 많을 경우
                if(i < (m-n+1)) {
                    sum[i] = arr[i]*n;
                }
                else {
                    sum[i] = arr[i]* (m-i);
                }
            }
            else {
                sum[i] = arr[i] * (m-i);
            }
        }

        max = sum[0];
        for(int i = 1; i < m; i++) {
            if (sum[i] > max) {
                max = sum[i];
                idx = i;
            }
        }

        System.out.println(arr[idx]+" "+max);
    }
}