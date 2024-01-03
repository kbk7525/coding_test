import java.io.*;
import java.util.StringTokenizer;

public class 기타레슨 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s= 0;
        int e = 0;
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < n; i++) {
            if(s < arr[i]) {
                s = arr[i];
            }
            e +=  arr[i];
        }
        while(s <= e) {
            int mid = (s+e)/2;
            int sum = 0;
            int cnt = 0;
            for(int i = 0; i < n; i++) {
                if(sum + arr[i] > mid) {
                    cnt++;
                    sum = 0;
                }
                sum = sum + arr[i];
            }
            if(sum != 0) {
                cnt++;
            }
            if(cnt > m) {
                s = mid+1;
            }
            else {
                e = mid-1;
            }
        }
        System.out.println(s);
    }
}