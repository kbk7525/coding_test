import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class 수강신청 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //Queue<String> q = new LinkedList<>(); 큐로 하니 시간초과
        LinkedHashSet<String> q = new LinkedHashSet<>();
        int cnt = 0;
        int k = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        for(int i = 0; i < l; i++) {
            st = new StringTokenizer(br.readLine());
;           String t = st.nextToken();
            if(q.contains(t)) {
                q.remove(t);
            }
            q.add(t);
        }
        for(String s : q) {
            System.out.println(s);
            cnt++;
            if(cnt == k) {
                break;
            }
        }
    }
}