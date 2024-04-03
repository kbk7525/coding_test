import java.util.Scanner;
public class 번데기 {
    static int a;
    static int t;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        t = sc.nextInt();
        n = sc.nextInt();
        System.out.println(play());
    }
    static int play() {
        int cnt = 2;
        int b = 0;
        int d = 0;
        while(true) {
            for(int i = 0; i < 4; i++) {
                if(i%2==0) {
                    b++;
                }
                else {
                    d++;
                }
                if(b == t && n == 0) {
                    return (b+d-1)%a;
                }
                if(d == t && n == 1) {
                    return (b+d-1)%a;
                }
            }
            for(int i = 0; i < cnt; i++) {
                b++;
                if(b == t && n == 0) {
                    return (b+d-1)%a;
                }
            }
            for(int i = 0; i < cnt; i++) {
                d++;
                if(d == t && n == 1) {
                    return (b+d-1)%a;
                }
            }
            cnt++;
        }
    }
}