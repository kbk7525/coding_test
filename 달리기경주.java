import java.util.*;
public class 달리기경주 {
    public static void main(String[] args) {
        달리기경주_Solution s = new 달리기경주_Solution();
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        System.out.println(s.solution(players, callings));
    }
}
class 달리기경주_Solution {
    public String[] solution(String[] players, String[] callings) {
        //이중포문으로 스왑해서 시간초과 남. 맵으로 변경
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < players.length; i++) {
            map.put(players[i], i+1);
        }
        for(int i = 0; i < callings.length; i++) {
            String tmp = "";
            tmp = players[map.get(callings[i])-2];
            players[map.get(callings[i])-2] = players[map.get(callings[i])-1];
            players[map.get(callings[i])-1] = tmp;
            map.put(callings[i], map.get(callings[i])-1);
            map.put(tmp, map.get(tmp)+1);
        }
        return players;
    }
}