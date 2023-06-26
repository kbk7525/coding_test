public class pgsd_week04_1 {
    public static void main(String[] args) {
        pw04_1_Solution s = new pw04_1_Solution();
        int[] arr = {1,2,7,6,4};
        System.out.println(s.solution(arr));
    }
}
class pw04_1_Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                for(int k = j+1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(isPrime(sum) == 1) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    public int isPrime(int num) {
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
