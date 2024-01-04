import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
public class 수묶기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> plus = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> min = new PriorityQueue<>();
        int n = scanner.nextInt();
        int one = 0;
        int zero = 0;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if(num > 1) {
                plus.add(num);
            }
            else if(num < 0) {
                min.add(num);
            }
            else if(num == 1) {
                one++;
            }
            else {
                zero++;
            }
        }
        while(plus.size() > 1) {
            int a = plus.poll();
            int b = plus.poll();
            sum += a*b;
        }
        if(!plus.isEmpty()) {
            sum += plus.poll();
        }
        while(min.size() > 1) {
            int a = min.poll();
            int b = min.poll();
            sum += a*b;
        }
        if(!min.isEmpty()) {
            if(zero == 0)  {
                sum += min.poll();
            }
        }
        sum += one;
        System.out.println(sum);
    }
}
