import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_08_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int F = Integer.parseInt(st.nextToken());

        for (int value : solution(N, F))
            System.out.print(value + " ");
    }

    static int[] answer;
    static boolean flag;

    static int[] solution(int N, int F) {
        int[] combinationArr = new int[N], arr = new int[N];
        boolean[] check = new boolean[N];
        int[][] maps = new int[N][N];


        for (int i = 0; i < N; i++)
            combinationArr[i] = Combination(N - 1, N - i - 1, maps);

        DFS(0, 0, F, N, combinationArr, arr, check);

        return answer;
    }

    static int Combination(int N, int r, int[][] maps) {
        if (maps[N][r] > 0) return maps[N][r];
        if (r == N || r == 0) return 1;
        else return maps[N][r] = Combination(N - 1, r, maps) + Combination(N - 1, r - 1, maps);
    }

    static void DFS(int start, int sum, int F, int N, int[] combinationArr, int[] arr, boolean[] check) {
        if (flag) return;
        if (start == N) {
            if (sum == F) {
                flag = true;
                answer = arr.clone();
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (!check[i]) {
                    check[i] = true;
                    arr[start] = i + 1;
                    DFS(start + 1, sum + (arr[start] * combinationArr[start]), F, N, combinationArr, arr, check);
                    check[i] = false;
                }
            }
        }
    }
}
