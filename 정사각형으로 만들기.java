class Solution {
    public int[][] solution(int[][] arr) {
        int rowlen = arr.length;
        int collen= arr[0].length;
        int max = Math.max(rowlen, collen);
        int[][] answer = new int[max][max];
        if(rowlen == collen) {
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[0].length; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
        }
        else if(rowlen > collen) {
            for(int i = 0; i < rowlen; i++) {
                for(int j = 0; j < collen; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
        }
        else {
            for(int i = 0; i < rowlen; i++) {
                for(int j = 0; j < collen; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
        }
        return answer;
    }
}