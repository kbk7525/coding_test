import java.util.*;
public class 괄호회전하기 {
}

class Solution8 {
    public int solution(String s) {
        int answer = 0;
        for(int i = 0; i < s.length(); i++) {
            Stack<Character> st = new Stack<>();
            String str = s.substring(i, s.length()) + s.substring(0, i);
            for(int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if(st.isEmpty()) {
                    st.push(ch);
                }
                else if(ch == ')' && st.peek() =='(') {
                    st.pop();
                }
                else if(ch == ']' && st.peek() == '[') {
                    st.pop();
                }
                else if(ch == '}' && st.peek() == '{') {
                    st.pop();
                }
                else {
                    st.push(ch);
                }
            }
            if(st.isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}