import java.util.Scanner;

public class BJ_1987 {
    public static int R, C;
    public static int[][] map;
    public static boolean[] visited;
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static int result = 0;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        R = scan.nextInt();
        C = scan.nextInt();

        map = new int[R][C];
        for (int x = 0; x < R; x++) {
            char c[] = scan.next().toCharArray();
            for (int y = 0; y < C; y++) {
                map[x][y] = c[y] - 'A';
            }
        }

        visited = new boolean[26];
        dfs(0, 0, 0);

        System.out.println(result);
    }

    public static void dfs(int x, int y, int cnt) {
        if (visited[map[x][y]]) {
            result = Math.max(result, cnt);
            return;
        } else {
            visited[map[x][y]] = true;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= R | ny >= C | nx < 0 | ny < 0) continue;
                dfs(nx, ny, cnt + 1);
            }
            visited[map[x][y]] = false;
        }
    }
}
