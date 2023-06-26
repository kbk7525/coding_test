import java.util.*;

public class pgsd_week04_4 {
    public static void main(String[] args) {
        pw04_4_Solution s = new pw04_4_Solution();
        int[] arr = {1,1,9,1,1,1};
        System.out.println(s.solution(arr, 0));
    }
}
class pw04_4_Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : priorities) {
            queue.add(i);
        }
        while(!queue.isEmpty()) {
            for(int i = 0; i < priorities.length; i++) {
                if(queue.peek() == priorities[i]) {
                    if(i == location) {
                        answer++;
                        return answer;
                    }
                    queue.poll();
                    answer++;
                }
            }
        }
        return answer;
    }
}
