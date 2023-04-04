import java.util.*;
public class week03_1 {
    public static void main(String[] args) {
        w03_1_Solution s = new w03_1_Solution();
        String[] info = {"java backend junior pizza 150",
                "python frontend senior chicken 210",
                "python frontend senior chicken 150",
                "cpp backend senior pizza 260",
                "java backend junior chicken 80",
                "python backend senior chicken 50"};
        String[] query = {"java and backend and junior and pizza 100",
                "python and frontend and senior and chicken 200",
                "cpp and - and senior and pizza 250",
                "- and backend and senior and - 150",
                "- and - and - and chicken 100",
                "- and - and - and - 150"};
        System.out.println(s.solution(info, query));
    }
}

//문제를 어떻게 풀어야할지 몰라서 구글링해서 풀었다..(1시간 고민)
class w03_1_Solution {
    public int[] solution(String[] info, String[] query) {
        Map<String, List<Integer>> infos = new HashMap<>();
        for(String i : info) {
            String[] sp = i.split(" ");
            int scores = Integer.parseInt(sp[4]);
            for(int j = 0; j < (1 << 4); j++) {
                StringBuilder key = new StringBuilder();
                for(int k = 0; k < 4; k++) {
                    if((j&(1 << k)) > 0) {
                        key.append(sp[k]);
                    }
                }
                infos.computeIfAbsent(key.toString(), s -> new ArrayList<>()).add(scores);
            }
        }
        for(Map.Entry<String, List<Integer>> entry : infos.entrySet()) {
            entry.getValue().sort(null);
        }
        int[] answer = new int[query.length];
        for(int i = 0; i < query.length; i++) {
            String[] splits = query[i].replaceAll("-","").replaceAll(" and ", "").split(" ");
            String k = splits[0];
            int score = Integer.parseInt(splits[1]);
            List<Integer> list = infos.getOrDefault(k, new ArrayList<>());
            int s = 0;
            int e = list.size();
            //이분탐색 (시간초과때문에 사용한듯하다)
            while(s < e) {
                int m = (s+e)/2;
                if(list.get(m) < score) {
                    s = m+1;
                }
                else {
                    e = m;
                }
            }
            answer[i] = list.size()-s;
        }
        return answer;
    }
}