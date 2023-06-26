public class test2 {
    public static void main(String[] args) {
        test2_Solution s = new test2_Solution();
        System.out.println(s.solution(3,10));
    }
}
class test2_Solution {
    public int[] solution(int n, int s) {
        if (n > s) {
            return new int[]{-1};
        }
        int[] answer = new int[n];
        int a = s/n;
        int b = s%n;
        for(int i = 0; i < n-b; i++) {
            answer[i] = a;
        }
        for(int i = n-b; i < n; i++) {
            answer[i] = a+1;
        }
        return answer;
    }
}
