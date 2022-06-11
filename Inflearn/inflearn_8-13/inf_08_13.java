import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_08_13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] map = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }

        System.out.print(solution(N, map));
    }

    static int[] dx = {0, 0, 1, -1, 1, 1, -1, -1}, dy = {1, -1, 0, 0, 1, -1, 1, -1};
    static boolean[][] check;

    public static int solution(int N, int[][] map) {
        int answer = 0;
        check = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!check[i][j] && map[i][j] == 1) {
                    DFS(i, j, map, N);
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void DFS(int x, int y, int[][] map, int N) {
        if (map[x][y] == 0) return;
        else {
            for (int i = 0; i < 8; i++) {
                int nx = dx[i] + x;
                int ny = dy[i] + y;

                if (nx >= N || ny >= N || nx < 0 || ny < 0) continue;
                if (map[nx][ny] == 0) continue;
                if (!check[nx][ny]) {
                    check[nx][ny] = true;
                    DFS(nx, ny, map, N);
                }
            }
        }
    }
}
