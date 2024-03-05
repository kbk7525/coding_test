import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class K번째소수 {
    static boolean prime[] = new boolean[10000001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        prime();
        for(int i = 2; i < 10000001; i++) {
            if(!prime[i]) {
                list.add(i);
            }
        }
        System.out.println(list.get(k-1));
    }
    static void prime() {
        prime[0] = true;
        prime[1] = true;
        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
            if(prime[i]) {
                continue;
            }
            for(int j = i*i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}