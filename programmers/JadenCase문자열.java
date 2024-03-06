import java.util.*;
public class JadenCase문자열 {
        public String solution(String s) {
            String answer = "";
            s = s.toLowerCase();
            //true를 넣으면 공백자도 토큰으로 인식(처음 안 사살)
            StringTokenizer st = new StringTokenizer(s, " ", true);
            while(st.hasMoreTokens()) {
                String word = st.nextToken()
                        ;            if(word.equals(" ")) {
                    answer += word;
                }
                else {
                    answer += (word.substring(0,1).toUpperCase() + word.substring(1));
                }
            }
            return answer;
        }
}
