import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 맥주축제 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        boolean answer = false;
        int tmp = 0;
        int[][] data = new int[k][2];
        for(int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            data[i][0] = v;
            data[i][1] = c;
        }
        Arrays.sort(data, ((o1, o2) -> {
            if(o1[1] == o2[1]) {
                return Integer.compare(o2[0], o1[0]);
            }
            else {
                return Integer.compare(o1[1], o2[1]);
            }
        }));
        for(int i = 0; i < k; i++) {
            pq.add(data[i][0]);
            tmp += data[i][0];
            if(pq.size() > n) {
                tmp -= pq.poll();
            }
            if(pq.size() == n && tmp >= m) {
                answer = true;
                System.out.println(data[i][1]);
                break;
            }
        }
        if(!answer) {
            System.out.println(-1);
        }
    }
}