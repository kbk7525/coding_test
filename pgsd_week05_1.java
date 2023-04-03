public class pgsd_week05_1 {
    public static void main(String[] args) {
        w05_1_Solution s = new w05_1_Solution();
        int[] lottos = {44,1,0,0,31,25};
        int[] win_nums = {31,10,45,1,6,19};
        System.out.println(s.solution(lottos, win_nums));
    }
}
class w05_1_Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int cnt = 0; //0의 갯수
        int eq = 0; //같은 숫자의 갯수
        for(int i = 0; i < lottos.length; i++) {
            if(lottos[i] == 0) {
                cnt++;
            }
            for(int j = 0; j < win_nums.length; j++) {
                if(lottos[i] == win_nums[j]) {
                    eq++;
                }
            }
        }
        //최고순위는 0의 갯수와 같은숫자의 갯수를 더한 값과 1을 비교해 큰 수를 7과 빼주고
        //최저순위는 같은숫자의 갯수와 1을 비교해 큰 수를 7과 빼준다.
        return new int[]{7-Math.max(cnt+eq,1), 7-Math.max(eq,1)};
    }
}