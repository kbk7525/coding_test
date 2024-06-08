import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 지름길 {
    static class dijk {
        int s;
        int e;
        int dist;
        dijk(int s, int e, int dist) {
            this.s = s;
            this.e = e;
            this.dist = dist;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<dijk> list = new ArrayList<>();
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int dist = Integer.parseInt(st.nextToken());
            if(end > d) {
                continue;
            }
            if(end - start > dist) {
                list.add(new dijk(start, end, dist));
            }
        }
        Collections.sort(list, new Comparator<dijk>() {
            public int compare(dijk i, dijk j) {
                if(i.s == j.s) {
                    return Integer.compare(i.e, j.e);
                }
                return Integer.compare(i.s, j.s);
            }
        });
        int move = 0;
        int idx = 0;
        int[] arr = new int[d+1];
        Arrays.fill(arr, Integer.MAX_VALUE);
        arr[0] = 0;
        while(move < d) {
            if(idx < list.size()) {
                dijk di = list.get(idx);
                if(move == di.s) {
                    arr[di.e] = Math.min(arr[move] + di.dist, arr[di.e]);
                    idx++;
                }
                else {
                    arr[move + 1] = Math.min(arr[move + 1], arr[move] + 1);
                    move++;
                }
            }
            else {
                arr[move + 1] = Math.min(arr[move + 1], arr[move] + 1);
                move++;
            }
        }
        System.out.println(arr[d]);
    }
}
