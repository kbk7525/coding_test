import java.util.ArrayList;
import static java.util.Collections.sort;

public class week02_2 {
    public static void main(String[] args) {
        week02_2_Solution s = new week02_2_Solution();
        int[] arr = {2,1,3,4,1};
        System.out.println(s.solution(arr));
    }
}
class week02_2_Solution {
    public int[] solution(int[] numbers) {
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                sum = numbers[i] + numbers[j];
                if(!list.contains(sum)) {
                    list.add(sum);
                }
            }
        }
        sort(list);
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
