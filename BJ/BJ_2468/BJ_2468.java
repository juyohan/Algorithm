import java.util.Scanner;

public class BJ_2468 {
    public static int N; // 을 기준으로
    public static int[][] map;
    public static boolean[][] visited;
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, -1, 0, 1};
    public static int result = 0;
    public static int maxHeight = 0;

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();

        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = scan.nextInt();
                maxHeight = Math.max(maxHeight, map[i][j]);
            }
        }

        for (int height = 0; height <= maxHeight; height++) {
            int cnt = 0;
            visited = new boolean[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j] && map[i][j] >= height) {
                        cnt++;
                        dfs(i, j, height);
                    }
                }
            }
            result = Math.max(cnt, result);
        }

        System.out.println(result);
    }

    public static void dfs(int x, int y, int height) {
        visited[x][y] = true;

        for (int k = 0; k < 4; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];

            if (nx >= N || nx < 0 || ny >= N || ny < 0) continue;
            if (visited[nx][ny] || map[nx][ny] < height) continue;
            dfs(nx, ny, height);
        }
    }
}
