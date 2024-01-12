import java.util.Scanner;

public class 문자열집합 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int cnt = 0;
        tree root = new tree();
        while(n > 0) {
            String st = scanner.next();
            tree now = root;
            for(int i = 0; i < st.length(); i++) {
                char c = st.charAt(i);
                if(now.next[c-'a'] == null) {
                    now.next[c-'a'] = new tree();
                }
                now = now.next[c-'a'];
                if(i == st.length()-1) {
                    now.end = true;
                }
            }
            n--;
        }
        while(m > 0) {
            String st = scanner.next();
            tree now = root;
            for(int i = 0; i < st.length(); i++) {
                char c = st.charAt(i);
                if(now.next[c-'a'] == null) {
                    break;
                }
                now = now.next[c-'a'];
                if(i == st.length()-1 && now.end) {
                    cnt++;
                }
            }
            m--;
        }
        System.out.println(cnt);
    }
}
class tree {
    tree[] next = new tree[26];
    boolean end;
}
