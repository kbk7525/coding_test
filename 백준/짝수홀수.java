import java.util.Scanner;
public class 짝수홀수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            long x = sc.nextLong();
            if(x == ((long)Math.sqrt(x) * (long)Math.sqrt(x))) {
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
        }
    }
}