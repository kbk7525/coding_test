import java.util.*;
public class 점프와순간이동 {
}
class Solution4 {
    public int solution(int n) {
        int ans = 0;
        while(n >= 1) {
            if(n % 2 == 0) {
                n /= 2;
                continue;
            }
            n--;
            ans++;
        }

        return ans;
    }
}