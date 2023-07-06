import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 0;
        int l = 0;
        int r = 0;
        int n = s.length()-1;
        while(r < n) {
            if(!check(s.substring(l,r), s.charAt(r))) {
                r++;
            }
            else {
                l++;
            }
        }
        cnt = Math.max(r-l, cnt);
        System.out.println(cnt);
    }
    public static boolean check(String s, char c) {
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }
}