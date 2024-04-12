import java.util.*;
public class 뉴스클러스터링 {
}

class Solution15 {
    public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        for(int i = 0; i < str1.length()-1; i++) {
            char c1 = str1.charAt(i);
            char c2 = str1.charAt(i+1);
            if((c1 >= 'a' && c1 <= 'z') && (c2 >= 'a' && c2 <= 'z')) {
                arr1.add(c1+""+c2);
            }
        }
        for(int i = 0; i < str2.length()-1; i++) {
            char c1 = str2.charAt(i);
            char c2 = str2.charAt(i+1);
            if((c1 >= 'a' && c1 <= 'z') && (c2 >= 'a' && c2 <= 'z')) {
                arr2.add(c1+""+c2);
            }
        }
        ArrayList<String> union = new ArrayList<>();
        ArrayList<String> inter = new ArrayList<>();
        for(String s : arr1) {
            if(arr2.remove(s)) {
                inter.add(s);
            }
            union.add(s);
        }
        union.addAll(arr2);
        double tmp = ((double)inter.size()/(double)union.size())*65536;
        if(union.size() == 0)
            return 65536;
        int answer = (int)tmp;
        return answer;
    }
}