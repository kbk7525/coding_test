import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class 감소하는수 {
    static ArrayList<Long> list;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        list = new ArrayList<>();
        int n = scanner.nextInt();
        if(n <= 10) {
            System.out.println(n);
        }
        else if(n > 1022) {
            System.out.println(-1);
        }
        else {
            for(int i = 0; i < 10; i++) {
                bfs(i,1);
            }
            Collections.sort(list);
            System.out.println(list.get(n));
        }
    }
    static void bfs(long n, int i) {
        if(i > 10) {
            return;
        }
        list.add(n);
        for(int j = 0; j < n%10; j++) {
            bfs((n*10)+j, j+1);
        }
    }
}