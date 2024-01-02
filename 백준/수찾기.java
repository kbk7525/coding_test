import java.util.Scanner;
import java.util.Arrays;

public class 수찾기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int m = scanner.nextInt();
        for(int i = 0; i < m; i++) {
            int t = scanner.nextInt();
            boolean check = false;
            int s = 0;
            int e = arr.length-1;
            while(s <= e) {
                int mid = (s+e)/2;
                int v = arr[mid];
                if(v > t) {
                    e = mid-1;
                }
                else if(v <  t) {
                    s = mid+1;
                }
                else {
                    check = true;
                    break;
                }
            }
            if(check) {
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
        }
    }
}