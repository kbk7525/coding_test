package boj;

import java.io.*;
public class boj_1212 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String eight = br.readLine();
        for(int i = 0; i < eight.length(); i++) {
        	int n = eight.charAt(i) - '0';    
            if(i == 0) {
            	if(n == 0) {
            		System.out.println(0);
                        break;
            	}
                if(n == 1)
                	sb.append("1");
                if(n == 2)
                    sb.append("10");
                if(n == 3)
                    sb.append("11");
                if(n == 4)
                	sb.append("100");
                if(n == 5)
                    sb.append("101");
                if(n == 6)
                    sb.append("110");
                if(n == 7)
                	sb.append("111");
            }
            if(i != 0) {
                if(n == 0)
                    sb.append("000");
                if(n == 1)
                    sb.append("001");
                if(n == 2)
                    sb.append("010");
                if(n == 3)
                	sb.append("011");
                if(n == 4)
                    sb.append("100");
                if(n == 5)
                    sb.append("101");
                if(n == 6)
                    sb.append("110");
                if(n == 7)
                    sb.append("111");
            }
        }
        System.out.println(sb);
	}
}