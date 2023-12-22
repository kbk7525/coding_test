import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DNA비밀번호 {
    static int[] check;
    static int[] dna;
    static int secret;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int cnt = 0;
        char[] arr = new char[s];
        check = new int[4];
        dna = new int[4];
        secret = 0;
        arr = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 4; i++) {
            check[i] = Integer.parseInt(st.nextToken());
            if(check[i] == 0) {
                secret++;
            }
        }
        for(int i = 0; i < p; i++) {
            add(arr[i]);
        }
        if(secret == 4) {
            cnt++;
        }
        for(int i = p; i < s; i++) {
            int j = i-p;
            add(arr[i]);
            remove(arr[j]);
            if(secret == 4) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    static void add(char c) {
        switch(c) {
            case 'A':
                dna[0]++;
                if(dna[0] == check[0]) {
                    secret++;
                }
                break;
            case 'C':
                dna[1]++;
                if(dna[1] == check[1]) {
                    secret++;
                }
                break;
            case 'G':
                dna[2]++;
                if(dna[2] == check[2]) {
                    secret++;
                }
                break;
            case 'T':
                dna[3]++;
                if(dna[3] == check[3]) {
                    secret++;
                }
                break;
        }
    }
    static void remove(char c) {
        switch (c) {
            case 'A':
                if(dna[0] == check[0]) {
                    secret--;
                }
                dna[0]--;
                break;
            case 'C':
                if(dna[1] == check[1]) {
                    secret--;
                }
                dna[1]--;
                break;
            case 'G':
                if(dna[2] == check[2]) {
                    secret--;
                }
                dna[2]--;
                break;
            case 'T':
                if(dna[3] == check[3]) {
                    secret--;
                }
                dna[3]--;
                break;
        }
    }
}
