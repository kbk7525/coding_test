package boj;
import java.util.*;

public class 문자열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			String s = sc.next();
			System.out.println(s.charAt(0)+""+s.charAt(s.length()-1));
		}
	}
}