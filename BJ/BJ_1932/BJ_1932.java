import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
//        Top - Down 방식
//        int[][] arr = new int[N+1][N+1];
//        for (int i = 1 ; i <= N ; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            for (int j = 1 ; j <= i ; j++)
//                arr[i][j] = Integer.parseInt(st.nextToken());
//        }

//        int[][] dp = new int[N+1][N+1];
//        dp[1][1] = arr[1][1];
//        for (int i = 2 ; i <= N ; i++) {
//            for (int j = 1 ; j <= i ; j++) {
//                dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + arr[i][j];
//            }
//        }

//        int max = -1;
//        for (int i = 1 ; i <= N ; i++)
//            max = Math.max(dp[N][i], max);

//        System.out.println(max);

        // Bottom - Up 방식
        int[][] arr = new int[N][N];
        for (int i = 0 ; i < N ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0 ; j <= i ; j++)
                arr[i][j] = Integer.parseInt(st.nextToken());
        }

        int[][] dp = new int[N][N];
        for (int i = 0 ; i < N ; i++)
            dp[N-1][i] = arr[N-1][i];

        for (int i = N - 2; i >= 0 ; i--) {
            for (int j = 0 ; j <= i ; j++) {
                dp[i][j] = arr[i][j] + Math.max(dp[i + 1][j], dp[i + 1][j + 1]);
            }
        }

        System.out.println(dp[0][0]);

    }
}
