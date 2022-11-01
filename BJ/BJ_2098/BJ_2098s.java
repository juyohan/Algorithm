import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2098s {
    static int[][] arr;
    static int[][] dp;
    static int N, CANNOT_CYCLE = 16 * 1000000 + 1, NOT_VISIT = CANNOT_CYCLE * 2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        dp = new int[N][1 << N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)
                arr[i][j] = Integer.parseInt(st.nextToken());

            Arrays.fill(dp[i], NOT_VISIT); // 방문 안한 값으로 채움
        }
    
        System.out.println(solution(0, 1));
        for (int[] items : dp) {
            for (int item : items) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    public static int solution(int current, int visited) {
        visited = visited | 1 << current; // 방문처리

        if (visited == (1 << N) - 1) { // 모든 도시를 방문 완료했을 때
            if (arr[current][0] == 0)  // 마지막 도시에서 처음 도시로 못 돌아갈 때
                return CANNOT_CYCLE;
            return arr[current][0]; // 처음 도시로 돌아오기 위한 비용
        }
        
        if (dp[current][visited] != NOT_VISIT) { // 이미 방문을 했다면, 해당 값 반환
            return dp[current][visited];
        }

        for (int i = 0 ; i < N ; i++) {
            if (arr[current][i] != 0 && (visited & (1 << i)) == 0) {// 다음 도시로 갈 수 있고, 방문하지 않았을 경우
                dp[current][visited] = Math.min(dp[current][visited], solution(i, visited) + arr[current][i]);
            }
        }

        return dp[current][visited];
    }
}
