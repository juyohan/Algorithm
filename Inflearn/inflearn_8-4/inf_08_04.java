import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_08_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int[] map : solution(N, M)) {
            for (int k : map) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    static int answer[][];
    static int index = 0;

    public static int[][] solution(int N, int M) {
        int count = (int) Math.pow(N, M);
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = i + 1;
        answer = new int[count][M];
        int[] split = new int[M];

        DFS(0, split, arr, N, M);

        return answer;
    }

    public static void DFS(int start, int[] split, int[] arr, int N, int M) {
        if (start == M) {
            for (int i = 0 ; i < split.length ; i++)
                answer[index][i] = split[i];
            index++;
            return;
        } else {
            for (int i = 0; i < N; i++) {
                split[start] = arr[i];
                DFS(start + 1, split, arr, N, M);
            }
        }
    }
}
