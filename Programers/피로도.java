class Solution {
    public static int[] visited;
    public static int answer = 0;
    
    public int solution(int k, int[][] dungeons) { 
        visited = new int[dungeons.length];
        dfs(0, k, dungeons);
        return answer;
    }
    
    public void dfs(int start, int k, int[][] dungeons) {
        for (int i = 0 ; i < dungeons.length; i++) {
            if (visited[i] == 0 && k >= dungeons[i][0]) {
                visited[i] = 1;
                dfs(start + 1, k - dungeons[i][1], dungeons);
                visited[i] = 0;
            }
        }
        answer = Math.max(answer, start);
    }
}