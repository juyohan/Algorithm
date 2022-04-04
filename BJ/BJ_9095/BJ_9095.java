import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_9095 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] dp = new int[12];
        int T = Integer.parseInt(br.readLine());

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i < 12 ; i++)
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];

        for (int i = 0 ; i < T ; i++)
            sb.append(dp[Integer.parseInt(br.readLine())] + "\n");

        System.out.println(sb);
    }
}
