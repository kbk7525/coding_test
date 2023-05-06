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
        //키맵에 있는 값을 하나씩 가져옴
        for(String s : keymap) {
            for(int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                //맵에 문자가 없으면 맵에 추가
                if(!map.containsKey(ch)) {
                    map.put(ch, i+1);
                }
                //맵에 문자가 있을 경우에는
                //현재 i보다 맵안에 있는 문자의 밸류값이 크면
                //원래 맵에 있던 값을 지우고 새로 추가
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
                //맵에 target 요소값이 없으면 res는 0
                if(!map.containsKey(c)) {
                    res = 0;
                    break;
                }
                //아니면 그 밸류값을 누적시겨줌
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