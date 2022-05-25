import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_07_10 {
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] maps = new int[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            maps[num1][num2] = 1;
        }

        System.out.print(solution(N, maps, 5));
    }

    public static int solution(int N, int[][] maps, int end) {
        int[] check = new int[N + 1];
        check[1] = 1;

        DFS(1, maps, check, end);

        return answer;
    }

    public static void DFS(int start, int[][] maps, int[] check, int end) {
        if (start == end) answer++;
        else {
            for (int i = 1; i < check.length; i++) {
                if (maps[start][i] == 1 && check[i] == 0) {
                    check[i] = 1;
                    DFS(i, maps, check, end);
                    check[i] = 0;
                }
            }
        }
    }
}
