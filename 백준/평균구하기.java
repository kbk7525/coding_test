import java.util.Scanner;
public class 평균구하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            sum += i;
        }
        System.out.println(sum * 100.0 / max / n);
    }
}
