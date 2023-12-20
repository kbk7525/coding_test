import java.util.Scanner;
public class 구간합구하기4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for(int k = 0; k < n; k++) {
            arr[k] = scanner.nextInt();
        }
        int[] s = new int[n+1];
        for(int k = 1; k <= n; k++) {
            s[k] = s[k-1] + arr[k-1];
        }
        for(int k = 0; k < m; k++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            System.out.println(s[j] - s[i-1]);
        }
    }
}