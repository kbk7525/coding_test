import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 컨테이너재배치 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int sum = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }
        int avg = sum/n;
        for(int i = 0; i < n; i++) {
            if(arr[i] > avg+1) {
                cnt1 += (arr[i]-avg-1);
            }
            else if(arr[i] < avg) {
                cnt2 += (avg-arr[i]);
            }
        }
        System.out.println(Math.max(cnt1, cnt2));
    }
}