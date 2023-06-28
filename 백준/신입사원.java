package boj;
import java.util.*;
public class 신입사원 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int cnt = 1;
			int[] arr = new int[n+1];
			for(int j = 0; j < n; j++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				arr[a] = b;
			}
			int tmp = arr[1];
			for(int j = 2; j <= n; j++) {
				if(tmp > arr[j]) {
					tmp = arr[j];
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}