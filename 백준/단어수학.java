package boj;

import java.util.*;
public class 단어수학 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[26];
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			for(int j = 0; j < s.length(); j++) {
				a[s.charAt(j)-'A'] += (Math.pow(10, s.length()-j-1));
			}
		}
		Arrays.sort(a);
		int num = 9;
		int ans = 0;
		for(int i = 25; i >= 0; i--) {
			if(a[i] == 0) {
				continue;
			}
			ans += a[i]*num;
			num--;
		}
		System.out.println(ans);
	}
}
