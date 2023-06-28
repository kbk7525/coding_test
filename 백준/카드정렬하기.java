package boj;

import java.util.*;
public class 카드정렬하기 {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		Scanner sc = new Scanner(System.in);
		int res = 0;
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			pq.add(sc.nextInt());
		}
		while(pq.size() > 1) {
			int a = pq.poll();
			int b = pq.poll();
			res += a+b;
			pq.add(a+b);
		}
		System.out.println(res);
	}
}
