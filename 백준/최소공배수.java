import java.util.Scanner;
public class 최소공배수 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int ans = a*b/gcd(a,b);
            System.out.println(ans);
        }
    }
    static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        else {
            return gcd(b, a%b);
        }
    }
}