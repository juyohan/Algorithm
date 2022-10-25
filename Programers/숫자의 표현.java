class Solution {
    public int solution(int n) {
        int answer = 0, sum = 0, minus = 1;
//         for (int i = 1; i <= n ; i++) {
//             sum += i;
            
//             if (sum == n) {
//                 answer++;
//             }
            
//             while (sum > n) {
//                 sum -= minus;
//                 minus++;
//                 if (sum == n) {
//                     answer++;
//                 }
//             }
//         }
        /**
         * 정수론 : 연속된 숫자의 합 갯수는 주어진 숫자의 약수들 중 홀수의 합과 같다.
         */
        for (int i = 1 ; i <= n ; i+=2) {
            if (n % i == 0) {
                answer++;
            }
        }
        return answer;
    }
}