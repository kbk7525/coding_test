import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.BufferedReader;
public class 수정렬하기5 {
    public static void main(String[] args) throws IOException {
        //스캐너 사용하니 메모리 초과 뜸
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        //for each문으로 출력했더니 메모리 초과
        for(int i = 0; i < n; i++) {
            sb.append(arr[i]).append('\n');
        }
        System.out.println(sb);
    }
}