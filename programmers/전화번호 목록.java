import java.util.*;
public class week04_1 {
    public static void main(String[] args) {
        String[] pb = {"123","456","789"};
        w04_1_Solution s = new w04_1_Solution();
        System.out.println(s.solution(pb));
    }
}
class w04_1_Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i = 0; i < phone_book.length-1; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])) {
                answer = false;
            }
        }
        return answer;
    }
}
