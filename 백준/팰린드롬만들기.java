package boj;

public class 팰린드롬만들기 {
	public static void main(String[] args) {
		Solution123 s = new Solution123();
		int n = s.solution("abcde");
		System.out.println(n);
	}
}
class Solution123 {
	public int solution(String s) {
		int cnt = s.length();
		for(int i = 0; i < s.length(); i++) {
			if(check(s.substring(i))) {
				break;
			}
			cnt++;
		}
		return cnt;
		
	}
	static boolean check(String s) {
		int l = 0;
		int r = s.length()-1;
		while(l<=r) {
			if(s.charAt(l) != s.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
}