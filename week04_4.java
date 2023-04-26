import java.util.*;
public class week04_4 {
    public static void main(String[] args) {
        w04_4_Solution s = new w04_4_Solution();
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        System.out.println(s.solution(genres, plays));
    }
}
class w04_4_Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> genreMap = new HashMap<>();
        HashMap<Integer, Integer> playMap = new HashMap<>();
        //맵에 장르와 재생횟수를 넣는 과정
        for(int i = 0; i < genres.length; i++) {
            if(!genreMap.containsKey(genres[i])) {
                genreMap.put(genres[i], plays[i]);
            }
            //이미 있으면 있던 재생수에 더해줌
            else {
                genreMap.put(genres[i], genreMap.get(genres[i])+plays[i]);
            }
        }
        //인덱스와 재생수를 넣는 과정
        for(int i = 0; i < plays.length; i++) {
            playMap.put(i, plays[i]);
        }
        //각각의 맵을 리스트로 내림차순으로 정렬
        ArrayList<String> genreList = new ArrayList<>(genreMap.keySet());
        Collections.sort(genreList, (o1, o2)->(genreMap.get(o2).compareTo(genreMap.get(o1))));
        ArrayList<Integer> playList = new ArrayList(playMap.keySet());
        Collections.sort(playList, (o1, o2)->(playMap.get(o2).compareTo(playMap.get(o1))));

        //앨범에 인덱스 값을 넣을 리스트
        ArrayList<Integer> album = new ArrayList();
        for(String genre : genreList) {
            int cnt = 0;
            for(int i : playList) {
                if(genres[i].equals(genre) && cnt < 2) {
                    album.add(i);
                    cnt++;
                }
            }
        }
        int[] answer = new int[album.size()];
        for(int i = 0; i < album.size(); i++) {
            answer[i] = album.get(i);
        }
        return answer;
    }
}
