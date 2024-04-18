import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 회전하는큐 {
    public static void main(String[] args) throws IOException {
        LinkedList<Integer> queue = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;
        for(int i = 1; i <= n; i++) {
            queue.add(i);
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            while(queue.getFirst() != num) {
                if(queue.indexOf(num) <= queue.size()/2) {
                    queue.addLast(queue.getFirst());
                    queue.pollFirst();
                }
                else {
                    queue.addFirst(queue.getLast());
                    queue.pollLast();
                }
                cnt++;
            }
            if(queue.getFirst() == num) {
                queue.pollFirst();
            }
        }
        System.out.println(cnt);
    }
}