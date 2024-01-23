import java.util.Scanner;

public class 나머지합 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long ans = 0;
        long[] arr = new long[n];
        long[] r = new long[m];
        arr[0] = scanner.nextInt();
        for(int i = 1; i < n; i++) {
            arr[i] = arr[i-1] + scanner.nextInt();
        }
        for(int i = 0; i < n; i++) {
            int remain = (int) (arr[i]%m);
            if(remain == 0) {
                ans++;
            }
            r[remain]++;
        }
        for(int i = 0; i < m; i++) {
            if(r[i] > 1) {
                ans += r[i]*(r[i]-1)/2;
            }
        }
        System.out.println(ans);
    }
}