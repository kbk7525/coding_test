import java.util.Scanner;
public class 용돈관리 {
    static int n;
    static int m;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int min = 1;
        int max = 0;
        arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            max += arr[i];
        }
        while(min <= max) {
            int mid = (min+max)/2;
            if(flag(mid)) {
                max = mid -1;
            }
            else {
                min = mid + 1;
            }
        }
        System.out.println(min);
    }

    public static boolean flag(int k) {
        int money = k;
        int cnt = 1;
        for(int i = 0; i < n; i++) {
            //쓸 돈이 더 적은 경우
            if(k < arr[i]) {
                return false;
            }
            if(money < arr[i]) {
                money = k;
                cnt++;
            }
            money -= arr[i];
        }
        return m >= cnt;
    }
}
