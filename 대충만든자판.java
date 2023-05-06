import java.util.*;

public class 대충만든자판 {
    public static void main(String[] args) {
        대충만든자판_Solution s = new 대충만든자판_Solution();
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD","AABB"};
        System.out.println(s.solution(keymap, targets));
    }
}
class 대충만든자판_Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        for(String s : keymap) {
            for(int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if(!map.containsKey(ch)) {
                    map.put(ch, i+1);
                }
                else if(i < map.get(ch)) {
                    map.remove(ch);
                    map.put(ch, i+1);
                }
            }
        }
        for(int i = 0; i < targets.length; i++) {
            int res = 0;
            for(int j = 0; j < targets[i].length(); j++) {
                char c = targets[i].charAt(j);
                if(!map.containsKey(c)) {
                    res = 0;
                    break;
                }
                else {
                    res += map.get(c);
                }
            }
            if(res == 0) {
                answer[i] = -1;
            }
            else {
                answer[i] = res;
            }
        }
        return answer;
    }
}