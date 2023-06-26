import java.util.*;
public class ps_w06_2 {
    public static void main(String[] args) {
        ps_w06_2_Solution s = new ps_w06_2_Solution();
        int[] arr = {2,1,1,2,3,1,2,3,1};
        System.out.println(s.solution(arr));
    }
}
class ps_w06_2_Solution {
    public int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack();
        int answer = 0;
        for(int i : ingredient) {
            stack.push(i);
            int size = stack.size();
            if(stack.size() > 3) {
                if(stack.get(size-4) == 1 && stack.get(size-3) == 2 && stack.get(size-2) == 3 && stack.get(size-1) == 1) {
                    answer++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }
        return answer;
    }
}
