public class 연속된부분수열의합 {
    public static void main(String[] args) {
        연속된부분수열의합_Solution s = new 연속된부분수열의합_Solution();
        int[] sequence = {1,2,3,4,5};
        int k = 7;
        System.out.println(s.solution(sequence, k));
    }
}
class 연속된부분수열의합_Solution {
    public int[] solution(int[] sequence, int k) {
        int s = 0;
        int e = 0;
        int sum = 0;
        int ss = 0;
        int ee = 0;
        int size = sequence.length;
        //오른쪽 값을 늘리면서 더해줌
        for(e = 0; e < sequence.length; e++) {
            sum += sequence[e];
            //더한값이 k보다 커지면 왼쪽값을 빼주면서 왼쪽 인덱스값을 늘려줌
            while(sum > k) {
                sum -= sequence[s];
                s++;
            }
            if(sum == k) {
                //사이즈가 더 크면 사이즈 줄이고 ss ee 값 업데이트
                if(size > e-s) {
                    size = e-s;
                    ss = s;
                    ee = e;
                }
                //사이즈가 같으면 더 앞의 값을 ss ee에 넣어줌
                else if(size == e-s) {
                    ss = Math.min(ss, s);
                    ee = Math.min(ee, e);
                }
            }
        }
        int[] answer = {ss, ee};
        System.out.println(ss + ", " + ee);
        return answer;
    }
}