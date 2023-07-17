import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(i == 0 && j == 0) {
                    continue;
                }
                if(i == 0) {
                    arr[i][j] += arr[i][j-1]; 
                }
                else if(j == 0) {
                    arr[i][j] += arr[i-1][j];
                }
                else {
                    arr[i][j] += Math.min(arr[i][j-1], arr[i-1][j]);
                }
            }
        }
        System.out.println(arr[row-1][col-1]);
    }
}