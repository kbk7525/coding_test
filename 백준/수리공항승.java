import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 수리공항승 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int cnt = 1;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int tape = (int) (arr[0]-0.5+l);
        for(int i = 1; i < n; i++) {
            if(tape < (int)(arr[i]+0.5)) {
                tape = (int)(arr[i]-0.5+l);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}