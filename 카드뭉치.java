public class 카드뭉치 {
    public static void main(String[] args) {
        카드뭉치_Solution s = new 카드뭉치_Solution();
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        System.out.println(s.solution(cards1, cards2, goal));
    }
}
class 카드뭉치_Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int idx1 = 0;
        int idx2 = 0;
        int len1 = cards1.length;
        int len2 = cards2.length;
        for(int i = 0; i < goal.length; i++) {
            String tmp = goal[i];
            if(idx1 < len1 && tmp.equals(cards1[idx1])) {
                idx1++;
            }
            else if(idx2 < len2 && tmp.equals(cards2[idx2])) {
                idx2++;
            }
            else {
                answer = "No";
            }
        }
        return answer;
    }
}