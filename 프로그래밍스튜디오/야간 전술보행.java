public class ps_w06_3 {
    public static void main(String[] args) {
        ps_w06_3_Solution s = new ps_w06_3_Solution();
        int[][] scope = {{3,4},{5,8}};
        int[][] times = {{2,5}, {4,3}};
        System.out.println(s.solution(10, scope, times));
    }
}
class ps_w06_3_Solution {
    public int solution(int distance, int[][] scope, int[][] times) {
        int answer = distance; //총거리
        int num = scope.length;
        for(int i = 0; i < num; i++) {
            //scope 정렬
            int start = Math.min(scope[i][0], scope[i][1]); //시작구간
            int end = Math.max(scope[i][0], scope[i][1]); //끝구간
            int work = times[i][0]; //일하는시간
            int rest = times[i][1]; //쉬는시간
            for(int j = start; j <= end; j++) {
                int sum = work + rest;
                int stat = j%sum; //일하는시간과 쉬는시간의 사이클
                //stat이 0보다 크고 일하는시간보다 작거나 같으면 일하는중
                if(stat > 0 && stat <= work) {
                    answer = Math.min(answer, j);
                }
            }
        }
        return answer;
    }
}
