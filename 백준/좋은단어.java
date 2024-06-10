import java.util.Scanner;
import java.util.Stack;

public class 좋은단어 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i < n; i++){
            String s = sc.next();
            Stack<Character> stack = new Stack<>();
            for(int j = 0; j < s.length(); j++){
                if(stack.size() > 0 && stack.peek() == s.charAt(j)) {
                    stack.pop();
                }
                else {
                    stack.push(s.charAt(j));
                }

            }
            if(stack.size() == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}