import java.io.*;

public class 수정렬하기3 {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        radix(arr, 5);
        for(int i = 0; i < n; i++) {
            bw.write(arr[i] + "\n");
        }
        bw.flush();
    }
    static void radix(int[] arr, int max) {
        int[] out = new int[arr.length];
        int j = 1;
        int cnt = 0;
        while(cnt != max) {
            int[] queue = new int[10];
            for(int i = 0; i < arr.length; i++) {
                queue[(arr[i]/j)%10]++;
            }
            for(int i = 1; i < 10; i++) {
                queue[i] += queue[i-1];
            }
            for(int i = arr.length-1; i >= 0; i--) {
                out[queue[(arr[i]/j%10)]-1] = arr[i];
                queue[(arr[i]/j)%10]--;
            }
            for(int i = 0; i < arr.length; i++) {
                arr[i] = out[i];
            }
            j *= 10;
            cnt++;
        }
    }
}
