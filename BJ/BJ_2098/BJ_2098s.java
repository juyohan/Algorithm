import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2098s {
    static int[][] arr;
    static int[][] dp;
    static int N, INF = Integer.MAX_VALUE - 1000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        dp = new int[N][(1 << N)];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)
                arr[i][j] = Integer.parseInt(st.nextToken());

            Arrays.fill(dp[i], INF); // 모든 값을 INF 로 채움
        }
    
        System.out.println(solution(0, 1));
    }

    public static int solution(int current, int visited) {
        if (visited == (1 << N) - 1) { // 모든 도시를 방문 완료했을 때
            if (arr[current][0] == 0) 
                return INF;
            return arr[current][0]; // 마지막 도시로 돌아오기 위한 비용
        }
        
        if (dp[current][visited] != INF) { // 이미 방문을 했다면, 해당 값 반환
            return dp[current][visited];
        }

        for (int i = 0 ; i < N ; i++) {
            if (arr[current][i] != 0 && (visited & (1 << i)) == 0)
                dp[current][visited] = Math.min(dp[current][visited], solution(i, visited | (1 << i)) + arr[current][i]);
        }

        return dp[current][visited];
    }
}
