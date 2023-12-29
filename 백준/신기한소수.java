import java.io.*;

public class 신기한소수 {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dfs(2, 1);
        dfs(3,1);
        dfs(5,1);
        dfs(7,1);
    }
    static void dfs(int v, int j) {
        if(j == n) {
            if(prime(v)) {
                System.out.println(v);
            }
            return;
        }
        for(int i = 1; i < 10; i++) {
            if(i%2 == 0) {
                continue;
            }
            if(prime(v*10+i)) {
                dfs(v*10+i, j+1);
            }
        }
    }
    static boolean prime(int num) {
        for(int i = 2; i <= num/2; i++) {
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }
}
