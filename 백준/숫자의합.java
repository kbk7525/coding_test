import java.util.*;
public class 숫자의합 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String num = scanner.next();
        int answer = 0;
        char[] charArray = num.toCharArray();
        for (char c : charArray) {
            answer += c - '0';
        }
        System.out.println(answer);
    }
}