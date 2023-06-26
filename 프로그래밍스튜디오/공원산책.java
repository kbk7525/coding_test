public class ps_w06_1 {
    public static void main(String[] args) {
        ps_w06_1_Solution s = new ps_w06_1_Solution();
        String[] park = {"SOO", "OOO", "OOO"};
        String[] routes = {"E 2", "S 2", "W 1"};
        System.out.println(s.solution(park, routes));
    }
}
class ps_w06_1_Solution {
    public int[] solution(String[] park, String[] routes) {
        int x = 0;
        int y = 0;
        char[][] park_route = new char[park.length][park[0].length()];
        for(int i = 0; i < park.length; i++) {
            park_route[i] = park[i].toCharArray();
            if(park[i].contains("S")){
                x = park[i].indexOf("S");
                y = i;
            }
        }
        for(String s : routes) {
            String direction = s.split(" ")[0];
            int len = Integer.parseInt(s.split(" ")[1]);
            int tx = x;
            int ty = y;
            for(int i = 0; i < len; i++) {
                if(direction.equals("N")) {
                    ty--;
                }
                if(direction.equals("S")) {
                    ty++;
                }
                if(direction.equals("W")) {
                    tx--;
                }
                if(direction.equals("E")) {
                    tx++;
                }
                if(tx >= 0 && tx < park_route[0].length && ty >= 0 && ty < park_route.length) {
                    if(park_route[ty][tx] == 'X') {
                        break;
                    }
                    if(i == len-1) {
                        x = tx;
                        y = ty;
                    }
                }
            }
        }
        int[] answer = {y,x};
        return answer;
    }
}
