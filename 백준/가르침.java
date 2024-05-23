import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가르침 {
    static int n;
    static int k;
    static String[] str;
    static boolean[] arr = new boolean[26];
    static int max = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = br.readLine();
        }
        arr['a' - 'a'] = true;
        arr['n' - 'a'] = true;
        arr['t' - 'a'] = true;
        arr['i' - 'a'] = true;
        arr['c' - 'a'] = true;

        if (k < 5) {
            System.out.println(max);
        } else {
            dfs(0, 0);
            System.out.println(max);
        }
    }
    public static void dfs(int idx, int cnt) {
        if (cnt + 5 == k) {
            count();
            return;
        }
        for (int i = idx; i < 26; i++) {
            if (arr[i]) {
                continue;
            }

            arr[i] = true;
            dfs(i + 1, cnt + 1);
            arr[i] = false;
        }
    }
    public static void count() {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            char[] alphas = str[i].toCharArray();
            boolean flag = true;
            for (char c: alphas) {
                if (!arr[c - 'a']) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                cnt++;
            }
        }
        max = Math.max(max, cnt);
    }
}