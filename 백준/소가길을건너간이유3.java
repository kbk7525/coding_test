import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 소가길을건너간이유3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int arrival = Integer.parseInt(st.nextToken());
            int sec = Integer.parseInt(st.nextToken());
            arr[i][0] = arrival;
            arr[i][1] = sec;
        }
        Arrays.sort(arr, (o1, o2)-> o1[0]-o2[0]);
        for(int i = 0; i < n; i++) {
            if(ans < arr[i][0]) {
                ans = arr[i][0] + arr[i][1];
            }
            else {
                ans += arr[i][1];
            }
        }
        System.out.println(ans);
    }
}