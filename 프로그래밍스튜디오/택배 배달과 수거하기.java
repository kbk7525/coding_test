public class pgsd_week05_3 {
    public static void main(String[] args) {
        w05_3_Solution s = new w05_3_Solution();
        int[] deliveries = {1,0,3,1,2};
        int[] pickups = {0,3,0,4,0};
        System.out.println(s.solution(4,5,deliveries, pickups));
    }
}

class w05_3_Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;
        int d = 0;
        int p = 0;
        //먼곳부터
        for(int i = n-1; i >= 0; i--) {
            d += deliveries[i];
            p += pickups[i];

            while(d > 0 || p > 0) {
                d -= cap;
                p -= cap;
                answer += (i+1)*2;
            }
        }
        return answer;
    }
}
