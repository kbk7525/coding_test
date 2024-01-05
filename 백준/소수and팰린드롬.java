import java.util.Scanner;
public class 소수and팰린드롬 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[10000001];
        for(int i = 2; i < arr.length; i++) {
            arr[i] = i;
        }
        for(int i = 2; i < Math.sqrt(arr.length); i++) {
            if(arr[i] == 0) {
                continue;
            }
            for(int j = i+i; j < arr.length; j += i) {
                arr[j] = 0;
            }
        }
        int num = n;
        while(true) {
            if(arr[num] != 0) {
                int ans = arr[num];
                if(pal(ans)) {
                    System.out.println(ans);
                    break;
                }
            }
            num++;
        }
    }
    static boolean pal(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        int s = 0;
        int e = arr.length-1;
        while(s < e) {
            if(arr[s] != arr[e]) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}