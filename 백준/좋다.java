import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 좋다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

        }
        Arrays.sort(arr);
        for(int i = 0; i < n; i++) {
            int k = arr[i];
            int start = 0;
            int end = n-1;
            while (start < end) {
                if(arr[start]+arr[end] == k) {
                    if(start != i && end != i) {
                        cnt++;
                        break;
                    }
                    else if(start == i) {
                        start++;
                    }
                    else if(end == i) {
                        end--;
                    }
                }
                else if(arr[start]+arr[end] > k) {
                    end--;
                }
                else {
                    start++;
                }
            }
        }
        System.out.println(cnt);
    }
}