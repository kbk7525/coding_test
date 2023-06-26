import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> list = new ArrayList<>();
        int[] supo1 = {1,2,3,4,5};
        int[] supo2 = {2,1,2,3,2,4,2,5};
        int[] supo3 = {3,3,1,1,2,2,4,4,5,5};
        int[] cnt = {0,0,0};
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == supo1[i%5]) {
                cnt[0]++;
            }
            if(answers[i] == supo2[i%8]) {
                cnt[1]++;    
            }
            if(answers[i] == supo3[i%10]) {
                cnt[2]++;
            }
        }
        int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
        if(max == cnt[0]) {
            list.add(1);
        }
        if(max == cnt[1]) {
            list.add(2);
        }
        if(max == cnt[2]) {
            list.add(3);
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
