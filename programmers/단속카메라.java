import java.util.*;
public class 단속카메라 {
    public static void main(String[] args) {
        단속카메라_Solution s = new 단속카메라_Solution();
        int[][] routes = {{-20,-15}, {-14,-5}, {-18,-13}, {-5,-3}};
        System.out.println(s.solution(routes));
    }
}
class 단속카메라_Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        int direction = -30000;
        //나간 곳을 기준으로 오름차순 정렬
        Arrays.sort(routes, (a,b)-> Integer.compare(a[1], b[1]));
        for(int[] arr : routes) {
            //위치가 진입위치보다 작으면 위치를 진출위치로 바꿈
            if(direction < arr[0]) {
                direction = arr[1];
                answer++;
            }
        }
        return answer;
    }
}
