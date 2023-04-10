import java.util.*;
public class week04_3 {
    public static void main(String[] args) {
        w04_3_Solution s = new w04_3_Solution();
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo",
                "Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        System.out.println(s.solution(record));
    }
}
class w04_3_Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> map = new HashMap<>();
        int change = 0;
        for(int i = 0; i < record.length; i++) {
            String[] info = record[i].split(" ");
            if(info[0].equals("Enter")) {
                map.put(info[1], info[2]);
            }
            else if(info[0].equals("Leave")) {
                continue;
            }
            else {
                map.put(info[1], info[2]);
                change++;
            }

        }
        String[] answer = new String[record.length-change];
        int index = 0;
        for(int i = 0; i < record.length; i++) {
            String[] info = record[i].split(" ");
            String name = map.get(info[1]);
            if(info[0].equals("Enter")) {
                answer[index++] = name + "님이 들어왔습니다.";
            }
            else if(info[0].equals("Leave")) {
                answer[index++] = name + "님이 나갔습니다.";
            }
        }
        return answer;
    }
}