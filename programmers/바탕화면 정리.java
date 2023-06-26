class Solution {
    public int[] solution(String[] wallpaper) {
        int rowlen = wallpaper.length;
        int collen = wallpaper[0].length();
        int minx = 51;
        int miny = 51;
        int maxx = -1;
        int maxy = -1;
        for(int i = 0; i < rowlen; i++) {
            for(int j = 0; j < collen; j++) {
                if(wallpaper[i].charAt(j) == '#') {
                    minx = Math.min(minx, i);
                    miny = Math.min(miny, j);
                    maxx = Math.max(maxx, i);
                    maxy = Math.max(maxy, j);
                }
            }
        }
        int[] answer = {minx, miny, maxx+1, maxy+1};
        return answer;
    }
}
