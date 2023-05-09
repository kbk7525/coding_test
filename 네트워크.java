public class 네트워크 {
    public static void main(String[] args) {
        네트워크_Solution s = new 네트워크_Solution();
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(s.solution(3, computers));
    }
}
class 네트워크_Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] check = new boolean[n];
        for(int i = 0; i < n; i++) {
            if(!check[i]) {
                dfs(i, computers, check);
                answer++;
            }
        }
        return answer;
    }
    boolean[] dfs(int i, int[][] computers, boolean[] check) {
        check[i] = true; //i값을 true로 만들어줌
        //배열을 돌면서 자기자신이 아니고 연결되어 있고 방문하지 않았을 때 dfs로 재귀
        for(int j = 0; j < computers.length; j++) {
            if(i != j && computers[i][j] == 1 && check[j] == false) {
                check = dfs(j, computers, check);
            }
        }
        return check;
    }
}