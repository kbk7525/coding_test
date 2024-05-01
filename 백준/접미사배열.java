import java.util.Arrays;
import java.util.Scanner;
public class 접미사배열 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String[] arr = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.substring(i, str.length());
        }
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}