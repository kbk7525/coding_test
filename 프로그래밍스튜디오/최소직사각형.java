public class 최소직사각형 {
    public static void main(String[] args) {
        최소직사각형_Solution s = new 최소직사각형_Solution();
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(s.solution(sizes));
    }
}
class 최소직사각형_Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int ww = 0;
        int hh = 0;
        for(int i = 0; i < sizes.length; i++) {
            //큰수가 배열 앞으로 오게 만듦 ([60,50], [70,30]...)
            int w = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            //가로가 제일 큰 값과 세로가 제일 큰 값을 넣어줌
            ww = Math.max(ww, w);
            hh = Math.max(hh, h);
        }
        answer = ww*hh;
        return answer;
    }
}
