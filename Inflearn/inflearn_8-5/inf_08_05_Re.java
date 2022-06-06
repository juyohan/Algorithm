import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_08_05_Re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(br.readLine());

        System.out.print(solution(arr, M));
    }

    static int answer = Integer.MAX_VALUE;

    public static int solution(int[] arr, int M) {

        DFS(0, M, 0, arr);

        return answer;
    }

    public static void DFS(int sum, int M, int count, int[] arr) {
        if (answer <= count || sum > M) return;
        if (sum == M) {
            answer = Math.min(count, answer);
        } else {
            for (int i = arr.length - 1; i >= 0; i--) {
                DFS(sum + arr[i], M, count + 1, arr);
            }
        }
    }
}
