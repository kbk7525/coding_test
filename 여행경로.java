import java.util.*;
public class 여행경로 {
    public static void main(String[] args) {
        여행경로_Solution s = new 여행경로_Solution();
        String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        System.out.println(s.solution(tickets));
    }
}
class 여행경로_Solution {
    boolean[] check;
    ArrayList<String> list = new ArrayList<>();
    public String[] solution(String[][] tickets) {
        check = new boolean[tickets.length];
        dfs("ICN", "ICN", tickets, 0);
        Collections.sort(list); //알파벳 빠른 순으로 정렬
        return list.get(0).split(" ");
    }
    void dfs(String start, String des, String[][] tickets, int cnt) {
        //모든 도시에 방문했으면 des에 추가
        if(cnt == tickets.length) {
            list.add(des);
            return;
        }
        //방문하지 않았고 출발지와 같으면
        for(int i = 0; i < tickets.length; i++) {
            if(!check[i] && tickets[i][0].equals(start)) {
                check[i] = true; //방문에 체크
                //도착한곳을 start로 넣어주고 des에 도착한곳을 넣어줌
                dfs(tickets[i][1], des + " " + tickets[i][1], tickets, cnt+1);
                check[i] = false;
            }
        }
    }
}