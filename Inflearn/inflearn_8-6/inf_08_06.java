import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_08_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        for (int[] map : solution(N, M, arr)) {
            for (int value : map)
                System.out.print(value + " ");
            System.out.println();
        }
    }

    static int[][] answer;
    static int answerIndex = 0;

    public static int[][] solution(int N, int M, int[] arr) {
        answer = new int[N * M][M];
        boolean[] check = new boolean[N];
        int[] split = new int[M];

        DFS(0, split, check, N, M, arr);

        return answer;
    }

    public static void DFS(int start, int[] split, boolean[] check, int N, int M, int[] arr) {
        if (start == M) {
            for (int i = 0 ; i < split.length ; i++)
                answer[answerIndex][i] = split[i];
            answerIndex++;
            return;
        } else {
            for (int i = 0; i < N; i++) {
                if (!check[i]) {
                    check[i] = true;
                    split[start] = arr[i];
                    DFS(start + 1, split, check, N, M, arr);
                    check[i] = false;
                }
            }
        }
    }
}
