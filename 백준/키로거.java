import java.io.*;
import java.util.Stack;

public class 키로거 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            Stack<Character> stack1 = new Stack<>();
            Stack<Character> stack2 = new Stack<>();
            String pass = br.readLine();
            for(int j = 0; j < pass.length(); j++){
                char c = pass.charAt(j);
                if(c == '<') {
                    if(!stack1.isEmpty()){
                        stack2.push(stack1.pop());
                    }
                }
                else if(c == '>') {
                    if(!stack2.isEmpty()){
                        stack1.push(stack2.pop());
                    }
                }
                else if(c == '-') {
                    if(!stack1.isEmpty()){
                        stack1.pop();
                    }
                }
                else {
                    stack1.push(c);
                }
            }
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
            for (Character character : stack1) {
                bw.write(character);
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}