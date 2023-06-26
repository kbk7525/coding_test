import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        Arrays.sort(score);
        int cnt = 0;
        for(int i = score.length-1; i >= 0; i--) {
            stack.push(score[i]);
            cnt++;
            if(cnt == m) {
                answer += stack.pop()*m;
                cnt = 0;
            }
        }
        return answer;
    }
}
