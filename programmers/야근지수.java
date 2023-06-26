import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        /* 효율성테스트에서 시간초과 (86.7점)
        while(n > 0) {
            Arrays.sort(works);
            works[works.length-1]--;
            n--;
            if(works[works.length-1] == -1) {
                works[works.length-1] = 0;
            }
        }
        for(int i : works) {
            answer += i*i;
        }
        return answer;
        */

        //우선순위 큐로 배열을 내림차순으로 정렬해서 집어넣음
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : works) {
            q.add(i);
        }
        //n만큼 돌면서 큰값을 꺼내서 -1한 후 q에 다시 집어넣음
        for(int i = 1; i <= n; i++) {
            int max = q.poll();
            q.add(max-1);
        }
        while(!q.isEmpty()) {
            int a = q.poll();
            if(a >= 0) {
                answer += a*a;
            }
        }
        return answer;
    }
}
