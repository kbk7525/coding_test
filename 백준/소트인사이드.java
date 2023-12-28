import java.util.Arrays;
import java.util.Scanner;
public class 소트인사이드 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int[] arr = new int[s.length()];
        for(int i = 0; i < s.length(); i++) {
            arr[i] = Integer.parseInt(s.substring(i, i+1));
        }
        Arrays.sort(arr);
        for(int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}