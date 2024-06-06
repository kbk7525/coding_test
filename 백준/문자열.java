import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s1 = st.nextToken();
        String s2 = st.nextToken();
        int cnt = s1.length();
        for(int i = 0; i <= s2.length()-s1.length(); i++) {
            int diff = 0;
            for(int j = 0; j < s1.length(); j++) {
                if(s1.charAt(j) != s2.charAt(j+i)) {
                    diff++;
                }
            }
            if(cnt > diff) {
                cnt = diff;
            }
        }
        System.out.println(cnt);
    }
}