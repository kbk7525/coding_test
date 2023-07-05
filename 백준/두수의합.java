package boj;
import java.util.*;

//투포인터 문제
public class 두수의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
        	arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int x = sc.nextInt();
        int cnt = 0;
        int l = 0;
        int r = arr.length-1;
        while(l < r) {
        	int sum = arr[l]+arr[r];
            if(sum == x) {
            	cnt++;
            }
            if(sum <= x) {
            	l++;
            }
            else {
            	r--;
            }
        }
        System.out.println(cnt);
    }
}