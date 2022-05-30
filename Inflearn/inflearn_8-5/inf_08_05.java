import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_08_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(br.readLine());

        System.out.print(solution(arr, N, M));
    }

    static int answer = Integer.MAX_VALUE;
    public static int solution(int[] arr, int N, int M) {
        DFS(arr, 0, 0, 0, N, M);

        return answer;
    }

    public static void DFS(int[] arr, int start, int sum, int count, int N, int M) {
        if (sum > M) return;
        if (answer <= start) return;
        if (sum == M) {
            answer = Math.min(answer, count);
            return;
        } else {
            for (int i = N - 1; i >= 0; i--) {
                DFS(arr, start + 1, sum + arr[i], count + 1, N, M);
            }
        }
    }
}
