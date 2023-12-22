import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class 오큰수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] answer = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        stack.push(0);
        for(int i = 1; i < n; i++) {
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                answer[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while(!stack.empty()) {
            answer[stack.pop()] = -1;
        }
        //print로 하니까 시간초과 뜸
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < n; i++) {
            bw.write(answer[i]+" ");
        }
        bw.flush();
    }
}