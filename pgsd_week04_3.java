import java.util.Arrays;

public class pgsd_week04_3 {
    public static void main(String[] args) {
        pw04_3_Solution s = new pw04_3_Solution();
        int[] people = {70,50,80,50};
        System.out.println(s.solution(people, 100));
    }
}
class pw04_3_Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int a = 0;
        Arrays.sort(people);
        for(int i = people.length-1; i >= a; i--) {
            if(people[a] + people[i] <= limit) {
                answer++;
                a++;
            }
            else {
                answer++;
            }
        }
        return answer;
    }
}
