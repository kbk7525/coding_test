public class pgsd_week05_2 {
    public static void main(String[] args) {
        ps05_2_Solution s = new ps05_2_Solution();
        int[] arr = {4,4,4,3,3};
        System.out.println(s.solution(arr));
    }
}
class ps05_2_Solution {
    public int[] solution(int []arr) {
        int idx = 0;
        for(int i = 0; i < arr.length; i++) {
            if(i == 0) {
                idx++;
            }
            else if(arr[i] != arr[i-1]) {
                idx++;
            }
        }
        
        int[] answer = new int[idx];
        idx = 0;
        for(int i = 0; i < arr.length; i++) {
            if(i == 0) {
                answer[idx] = arr[0];
                idx++;
            }
            else if(arr[i] != arr[i-1]) {
                answer[idx] = arr[i];
                idx++;
            }
        }
        return answer;
    }
}
