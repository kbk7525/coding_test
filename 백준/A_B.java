package boj;

import java.util.*;
public class A_B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int cnt = 1;
		while(a != b) {
			if(b < a) {
				System.out.println(-1);
				return;
			}
			if(b%10==1) {
				b/=10;
			}
			else if(b%2==0) {
				b/=2;
			}
			else {
				System.out.println(-1);
				return;
			}
			cnt++;
		}
		System.out.println(cnt);
	}
}