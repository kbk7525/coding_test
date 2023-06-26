public class pgsd_week04_2 {
    public static void main(String[] args) {
        pw04_2_Solution s = new pw04_2_Solution();
        System.out.println(s.solution(45));
    }
}
class pw04_2_Solution {
    public int solution(int n) {
        int answer = 0;
        String s = "";
        while(n != 0) {
            s += n%3;
            n /= 3;
        }
        answer = Integer.parseInt(s, 3);
        return answer;
    }
}
