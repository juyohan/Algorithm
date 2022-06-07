import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_08_06_Re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        for (int[] map : solution(N, M, arr)) {
            for (int k : map) {
                System.out.print(k + " ");
            }
        }
    }

    static int[][] answer;
    static int answerIndex = 0;

    public static int[][] solution(int N, int M, int[] arr) {
        answer = new int[N * M][M];
        int[] split = new int[M];
        boolean[] check = new boolean[N];

        DFS(0, M, arr, check, split);
        return answer;
    }

    public static void DFS(int start, int M, int[] arr, boolean[] check, int[] split) {
        if (start == M) {
            for (int i = 0; i < M; i++)
                answer[answerIndex][i] = split[i];
            answerIndex++;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (!check[i]) {
                    check[i] = true;
                    split[start] = arr[i];
                    DFS(start + 1, M, arr, check, split);
                    check[i] = false;
                }
            }
        }
    }
}
