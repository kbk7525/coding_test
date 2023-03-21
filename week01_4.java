public class week01_4 {
    public static void main(String[] args) {
        week01_4_Solution s = new week01_4_Solution();
        String[][] places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
                {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
                {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
                {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
        System.out.println(s.solution(places));
    }
}
class week01_4_Solution {
    public int[] solution(String[][] places) {
        int[] answer = {1,1,1,1,1};
        char[][] arr = new char[5][5];
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                arr[j] = places[i][j].toCharArray();
            }
            for(int k = 0; k < 5; k++) {
                for(int p = 0; p < 5; p++) {
                    if(arr[k][p] == 'P') {
                        for(int d = 0; d < 4; d++) {
                            int x = k + dx[d];
                            int y = p + dy[d];
                            if(x >= 0 && y >= 0 && x < 5 && y < 5) {
                                if(arr[x][y] == 'P') {
                                    answer[i] = 0;
                                    break;
                                }
                                else if (arr[x][y] == 'O') {
                                    for(int di = 0; di < 4; di++) {
                                        int xx = x+dx[di];
                                        int yy = y+dy[di];
                                        if(xx == k && yy == p) {
                                            continue;
                                        }
                                        if(xx >= 0 && yy >= 0 && xx < 5 && yy < 5 && arr[xx][yy] =='P') {
                                            answer[i] = 0;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }
}