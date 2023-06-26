public class pgsd_week05_4 {
    public static void main(String[] args) {
        w05_4_Solution s = new w05_4_Solution();
        System.out.println(s.solution(16));
    }
}
class w05_4_Solution {
    public int solution(int storey) {
        int answer = 0;
        while(storey != 0) {
            int a = storey%10;
            storey = storey/10;
            if(a > 5) {
                answer += 10-a;
                storey++;
            }
            else if(a < 5){
                answer += a;
            }
            //이 케이스를 생각못했다
            //5일경우 앞자리가 5이상이면 올리고 아니면 내린다.
            else if(a == 5) {
                if(storey%10 >= 5) {
                    answer += 10-a;
                    storey++;
                }
                else {
                    answer += a;
                }
            }
        }
        return answer;
    }
}
