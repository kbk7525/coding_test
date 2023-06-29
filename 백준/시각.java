package boj;

import java.util.*;
public class 시각 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int cnt = 0;
		for(int h = 0; h <= n; h++) {
			for(int m = 0; m <= 59; m++) {
				for(int s = 0; s <= 59; s++) {
					if(h/10==k || h%10==k || m/10==k || m%10==k || s/10==k || s%10==k) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}