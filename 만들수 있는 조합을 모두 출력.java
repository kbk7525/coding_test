import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        comb(arr, visited, 0, n, k);
    }
    static void comb(int[] arr, boolean[] visited, int dep, int n, int k) {
        if(k == 0) {
            print(arr, visited, n);
            return;
        }
        if(dep == n) {
            return;
        }
        visited[dep] = true;
        comb(arr, visited, dep+1, n, k-1);
        visited[dep] = false;
        comb(arr, visited, dep+1, n, k);
    }
    static void print(int[] arr, boolean[] visited, int n) {
        for(int i = 0; i < n; i++) {
            if(visited[i]) {
                System.out.print(arr[i] + " ");
            } 
        }
        System.out.println();
    }
}