import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class N번째큰수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> q = new PriorityQueue<>();
        List<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                q.add(Integer.parseInt(st.nextToken()));
            }
        }
        for(int i = 0; i < n*n; i++){
            list.add(q.poll());
        }
        System.out.println(list.get(list.size()-n));
    }
}
