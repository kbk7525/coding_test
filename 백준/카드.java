import java.util.HashMap;
import java.util.Scanner;
public class 카드 {
    public static void main(String[] args) {
        HashMap<Long, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int max = 0;
        long maxn = 0;
        for(int i = 0; i < n; i++) {
            long num = sc.nextLong();
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num) > max) {
                max = map.get(num);
                maxn = num;
            }
            else if(map.get(num) == max) {
                maxn = Math.min(maxn, num);
            }
        }
        System.out.println(maxn);
    }
}