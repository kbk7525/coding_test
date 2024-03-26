import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 속도위반 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] limit = new int[100];
        int[] speed = new int[100];
        int distance = 0;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            for(int j = distance; j < distance + l; j++) {
                limit[j] = s;
            }
            distance += l;
        }
        distance = 0;
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            for(int j = distance; j < distance + l; j++) {
                speed[j] = s;
            }
            distance += l;
        }
        int max = 0;
        for(int i = 0; i < limit.length; i++) {
            int over = speed[i]-limit[i];
            if(over > max) {
                max = over;
            }
        }
        System.out.println(max);
    }
}