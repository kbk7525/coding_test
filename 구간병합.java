import java.util.*;

public class Solution {
    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][2];
        for(int i = 0; i < num; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int s = arr[0][0];
        int e = arr[0][1];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i][0] <= e) {
                e = Math.max(e, arr[i][1]);
            }
            else {
                list.add(new int[]{s,e});
                s = arr[i][0];
                e = arr[i][1];
            }
        }
        list.add(new int[]{s,e});
        int[][] answer = new int[list.size()][2];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        for(int i = 0; i < answer.length; i++){
            System.out.println(answer[i][0]+ " " + answer[i][1]);
        }
    }
}