import java.util.*;
public class 기능개발 {
}
class Solution12 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int cnt = 0;
        for(int i = 0; i < progresses.length; i++) {
            if((100-progresses[i])%speeds[i] == 0) {
                queue.add((100-progresses[i])/speeds[i]);
            }
            else {
                queue.add((100-progresses[i])/speeds[i]+1);
            }
        }
        int n = queue.poll();
        cnt++;
        while(!queue.isEmpty()) {
            if(n >= queue.peek()) {
                cnt++;
                queue.poll();
            }
            else {
                arr.add(cnt);
                cnt = 1;
                n = queue.poll();
            }
        }
        arr.add(cnt);
        int[] answer = new int[arr.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}