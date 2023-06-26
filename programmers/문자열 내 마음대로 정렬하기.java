import java.util.ArrayList;

import static java.util.Collections.sort;
import java.util.ArrayList;

public class week02_1 {
    public static void main(String[] args) {
        week02_1_Solution s = new week02_1_Solution();
        String[] arr = {"sun", "bed", "car"};
        System.out.println(s.solution(arr, 1));
    }
}
class week02_1_Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < strings.length; i++) {
            list.add(strings[i].substring(n,n+1)+strings[i]);
        }
        sort(list);
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1,list.get(i).length());
        }
        return answer;
    }
}
