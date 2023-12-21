import java.util.Scanner;
//투포인터 문제
public class 수들의합5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 1;
        int sum = 1;
        int start = 1;
        int end = 1;
        while(end != n) {
            if(sum == n) {
                cnt++;
                end++;
                sum += end;
            }
            else if(sum > n) {
                sum -= start;
                start++;
            }
            else {
                end++;
                sum += end;
            }
        }
        System.out.println(cnt);
    }
}