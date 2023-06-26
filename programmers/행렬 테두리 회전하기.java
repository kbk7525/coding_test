public class test1 {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int rows = 6;
        int columns = 6;
        int[][] queries = {{2,2,5,4}, {3,3,6,6}, {5,1,6,3}};
        System.out.println(s.solution(rows,columns,queries));
    }
}
class Solution1 {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int querySize = queries.length;
        int[][] mat = new int[rows][columns];
        int[][] tmp = new int[rows][columns]; //임시배열

        //매트릭스 만듦
        int num = 1;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                mat[i][j] = num;
                tmp[i][j] = num;
                num++;
            }
        }
        for(int i = 0; i < querySize; i++) {
            int x1 = queries[i][0]-1;
            int y1 = queries[i][1]-1;
            int x2 = queries[i][2]-1;
            int y2 = queries[i][3]-1;

            int minNum = mat[x1][y1];
            //위,아래 줄 최솟값
            for(int j = y1; j <= y2; j++) {
                if(minNum > mat[x1][j]) {
                    minNum = mat[x1][j];
                }
                if(minNum > mat[x2][j]) {
                    minNum = mat[x2][j];
                }
            }
            //왼쪽, 오른쪽 최솟값
            for(int j = x1; j <= x2; j++) {
                if(minNum > mat[j][y1]) {
                    minNum = mat[j][y1];
                }
                if(minNum > mat[j][y2]) {
                    minNum = mat[j][y2];
                }
            }
            //위쪽 회전
            for(int j = y1+1; j <= y2; j++) {
                tmp[x1][j] = mat[x1][j-1];
            }
            //아래쪽 회전
            for(int j = y1; j <= y2-1; j++) {
                tmp[x2][j] = mat[x2][j+1];
            }
            //오른쪽 회전
            for(int j = x1+1; j <= x2; j++) {
                tmp[j][y2] = mat[j-1][y2];
            }
            //왼쪽 회전
            for(int j = x1; j <= x2-1; j++) {
                tmp[j][y1] = mat[j+1][y1];
            }
            for(int k = 0; k < rows; k++) {
                for(int j = 0; j < columns; j++) {
                    mat[k][j] = tmp[k][j];
                }
            }
            answer[i] = minNum;
        }
        return answer;
    }
}
