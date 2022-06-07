import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_08_09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int[] map : solution(N, M)) {
            for (int k : map)
                System.out.print(k + " ");
            System.out.println();
        }
    }

    static int[][] answer;
    static int answerIndex = 0;

    public static int[][] solution(int N, int M) {
        int index = 0;
        for (int i = 0 ; i < N ; i++ )
            index += i;
        answer = new int[index][M];
        int[] split = new int[M];

        DFS(0, 0, M, N, split);

        return answer;
    }

    public static void DFS(int start, int s, int M, int N, int[] split) {
        if (start == M) {
            for (int i = 0; i < split.length; i++)
                answer[answerIndex][i] = split[i];
            answerIndex++;
        } else {
            for (int i = s; i < N; i++) {
                split[start] = i + 1;
                DFS(start + 1, i + 1, M, N, split);
            }
        }
    }
}
