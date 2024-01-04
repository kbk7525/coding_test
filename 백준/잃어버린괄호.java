import java.util.Scanner;
public class 잃어버린괄호 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String[] arr = s.split("-");
        int ans = 0;
        for(int i = 0; i < arr.length; i++) {
            int tmp = sum(arr[i]);
            if(i == 0) {
                ans += tmp;
            }
            else {
                ans -= tmp;
            }
        }
        System.out.println(ans);
    }
    static int sum(String st) {
        int sum = 0;
        String[] tmp = st.split("[+]");
        for(int i = 0; i < tmp.length; i++) {
            sum += Integer.parseInt(tmp[i]);
        }
        return sum;
    }
}
