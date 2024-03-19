import java.util.*;
public class 구명보트 {
}
class Solution5 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int idx = 0;
        Arrays.sort(people);
        for(int i = people.length-1; i >= idx; i--) {
            if(people[i] + people[idx] <= limit) {
                idx++;
                answer++;
            }
            else {
                answer++;
            }
        }
        return answer;
    }
}