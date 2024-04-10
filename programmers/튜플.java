import java.util.*;
public class 튜플 {
}
class Solution13 {
    public ArrayList<Integer> solution(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        s = s.replace("{{", "").replace("}}", "");
        String[] str = s.split("\\},\\{");
        Arrays.sort(str, (o1, o2)-> {
            return o1.length()-o2.length();
        });
        for(int i = 0; i < str.length; i++) {
            String[] arr = str[i].split(",");
            for(int j = 0; j < arr.length; j++) {
                int n = Integer.parseInt(arr[j]);
                if(!list.contains(n)) {
                    list.add(n);
                }
            }
        }
        return list;
    }
}