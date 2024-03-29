import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class inf_08_01 {
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
    static boolean flag = false;

    public static String solution(int N, int[] arr) {
        int sum = Arrays.stream(arr).sum();

        if (sum % 2 != 0) return answer;

        DFS(0, N, 0, sum, arr);

        return answer;
    }

    public static void DFS(int start, int N, int sum, int total, int[] arr) {
        if (flag) return;
        if (start == N) {
            if (total / 2 - sum == 0) {
                flag = true;
                answer = "YES";
            }
        } else {
            DFS(start + 1, N, sum + arr[start], total, arr);
            DFS(start + 1, N, sum, total, arr);
        }
    }
}
