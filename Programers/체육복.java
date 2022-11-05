import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] shirt = new int[n + 1]; // 5명이면 1~5까지 배열이 존재하도록
        
        // 오름차 순으로 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 체육복 잃어버린 사람
        for (int data : lost) {
            shirt[data] = 1; 
        }
        
        // 잃어버렸는데 여분 있는 사람
        for (int i = 0 ; i < reserve.length ; i++) {
            if (shirt[reserve[i]] == 1) { 
                shirt[reserve[i]] = 0;
                reserve[i] = 0;
            }
        }
        
        // 체육복도 있고 여분 있는 사람
        for (int i = 0 ; i < reserve.length ; i++) {    
            if (reserve[i] == 0) {
                continue;
            }
            
            if (reserve[i] > 1 && shirt[reserve[i] - 1] == 1) {
                shirt[reserve[i] - 1] = 0;
                continue;
            }
            
            if (reserve[i] < n && shirt[reserve[i] + 1] == 1) {
                shirt[reserve[i] + 1] = 0;
                continue;
            }
        }
        
        for (int data : shirt) {
            if (data == 0)
                answer++;
        }
        return answer - 1; // index 가 0인 곳 제외
    }
}