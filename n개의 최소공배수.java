class Solution {
    static int gcd(int a, int b) {
        while(b > 0) {
            int tmp = a;
            a = b;
            b = tmp%b;
        }
        return a;
    }
    public int solution(int[] arr) {
        //arr의 원소 개수가 2개일때
        int g = gcd(arr[0], arr[1]);
        int answer = arr[0]*arr[1]/g;
        //한개일때
        if(arr.length == 1) {
            answer = arr[0];
        }
        //3개이상일때
        else if(arr.length > 2) {
            for(int i = 2; i < arr.length; i++) {
                g = gcd(answer, arr[i]);
                answer = answer*arr[i]/g;
            }
        }
        return answer;

    }
}