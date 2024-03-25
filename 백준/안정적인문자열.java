import java.util.Scanner;
import java.util.Stack;

public class 안정적인문자열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        while(true) {
            Stack<Character> stack = new Stack<>();
            String str = sc.next();
            int cnt = 0;
            if(str.charAt(0) == '-') {
                break;
            }
            for(int i = 0; i < str.length(); i++) {
                char tmp = str.charAt(i);
                if(tmp == '{') {
                    stack.push(tmp);
                }
                else {
                    if(stack.isEmpty()) {
                        cnt++;
                        stack.push('{');
                    }
                    else {
                        stack.pop();
                    }
                }
            }
            System.out.println((num++) + ". " + (stack.size()/2 + cnt));
        }
    }
}