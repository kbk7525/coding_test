import java.util.Scanner;
public class 세로읽기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] arr = new char[5][15];
        String str = "";
        for(int i = 0; i < 5; i++) {
            str = scanner.next();
            for(int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < 5; j++) {
                //빈 문자면 출력 x
                if(arr[j][i] == '\0') {
                    continue;
                }
                System.out.print(arr[j][i]);
            }
        }
    }
}