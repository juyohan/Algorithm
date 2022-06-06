import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class inf_08_01_Re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        System.out.print(solution(N, arr));
    }

    static String answer = "NO";

    public static String solution(int N, int[] arr) {
        int sum = Arrays.stream(arr).sum();

        if (sum % 2 != 0)
            return answer;

        DFS(0, N, sum / 2, 0, arr);

        return answer;
    }

    public static void DFS(int start, int N, int result, int sum2, int[] arr) {
        if (start == N) {
            if (result - sum2 == 0)
                answer = "YES";
            return;
        } else {
            DFS(start + 1, N, result, sum2 + arr[start], arr);

            DFS(start + 1, N, result, sum2, arr);
        }
    }
}
