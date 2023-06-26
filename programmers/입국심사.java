import java.util.*;
public class week03_2 {
    public static void main(String[] args) {
        w03_2_Solution s = new w03_2_Solution();
        int[] times = {7,10};
        System.out.println(s.solution(6, times));
    }
}
class w03_2_Solution {
    public long solution(int n, int[] times) {
        long answer = Long.MAX_VALUE;
        Arrays.sort(times);
        long s = times[0]; //가장 짧은 시간
        long e = (long)n*times[times.length-1]; //제일 긴시간
        //이분탐색
        while(s <= e) {
            long m = (s+e)/2;
            long sum = 0;
            for(int t : times) {
                sum += m/t;
            }
            if(sum >= n) {
                answer = Math.min(answer, m);
                e = m-1;
            }
            else {
                s = m+1;
            }
        }
        return answer;
    }
}
