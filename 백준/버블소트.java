import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.BufferedReader;
class Index implements Comparable<Index> {
    int v;
    int idx;

    public Index(int v, int idx) {
        super();
        this.v = v;
        this.idx = idx;
    }
    public int compareTo(Index i) {
        return this.v - i.v;
    }
}
public class 버블소트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Index[] arr = new Index[n];
        for(int i = 0; i < n; i++) {
            arr[i] = new Index(Integer.parseInt(br.readLine()), i);
        }
        Arrays.sort(arr);
        int max = 0;
        for(int i = 0; i < n; i++) {
            if(max < arr[i].idx-i) {
                max = arr[i].idx-i;
            }
        }
        System.out.println(max+1);
    }
}
