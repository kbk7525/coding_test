package boj;

import java.util.*;
public class 스택수열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int s = 0;
		while(n > 0) {
			int num = sc.nextInt();
			if(num > s) {
				for(int i = s+1; i <= num; i++) {
					stack.push(i);
					sb.append('+').append('\n');
				}
				s = num;
			}
			else if(stack.peek() != num) {
				System.out.println("NO");
				return;
			}
			stack.pop();
			sb.append('-').append('\n');
			n--;
		}
		System.out.println(sb);
	}
}