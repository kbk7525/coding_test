import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 행운의바퀴 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        char[] arr = new char[n];
        int idx = 0;
        String ans = "";
        for(int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            char ch = st.nextToken().charAt(0);
            if(idx+s >= n) {
                idx = (idx+s)%n;
            }
            else {
                idx = idx+s;
            }
            //행운의 바퀴가 없는 경우
            if(arr[idx] != 0 && arr[idx] != ch) {
                System.out.println("!");
                return;
            }
            arr[idx] = ch;
        }
        for(int i = idx; i >= 0; i--) {
            if(arr[i] == 0) {
                ans += "?";
            }
            else if(ans.contains(Character.toString(arr[i]))) {
                System.out.println("!");
                return;
            }
            else {
                ans += arr[i];
            }
        }
        for(int i = n-1; i > idx; i--) {
            if(arr[i] == 0) {
                ans += "?";
            }
            else if(ans.contains(Character.toString(arr[i]))) {
                System.out.println("!");
                return;
            }
            else {
                ans += arr[i];
            }
        }
        System.out.println(ans);
    }
}