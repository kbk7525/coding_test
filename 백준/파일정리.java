import java.util.*;

public class 파일정리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            String str = sc.next();
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == '.') {
                    str = str.substring(j+1);
                    if(!map.containsKey(str)) {
                        list.add(str);
                    }
                    map.put(str, map.getOrDefault(str, 0) + 1);
                }
            }
        }
        Collections.sort(list);
        for(String s : list) {
            System.out.println(s + " " + map.get(s));
        }
    }
}