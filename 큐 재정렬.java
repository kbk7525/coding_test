import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int k = sc.nextInt();
            arr[i][0] = h;
            arr[i][1] = k;
        }
        Arrays.sort(arr, (a,b)->{
            if(a[0] == b[0]) {
                return a[1]-b[1];
            }
            return b[0]-a[0];
        });
        ArrayList<int[]> ans= new ArrayList<>();
        for(int[] person: arr){
            ans.add(person[1], person);
        }
        for(int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i)[0] + " " + ans.get(i)[1]);
        }
    }
}