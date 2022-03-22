import java.util.Scanner;

public class BJ_10026 {
    public static char[][] map;
    public static boolean[][] visited;
    public static int N;
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        scan.nextLine();

        map = new char[N][N];
        for (int i = 0; i < N; i++) {
            String str = scan.nextLine();
            map[i] = str.toCharArray();
        }

        for (int i = 0; i < 2; i++) {
            visited = new boolean[N][N];
            int count = 0;
            for (int x = 0; x < N; x++) {
                for (int y = 0; y < N; y++) {
                    if (!visited[x][y]) {
                        count++;
                        dfs(x, y);
                    }
                    if (map[x][y] == 'G')
                        map[x][y] = 'R';
                }
            }
            System.out.println("count = " + count);
        }
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        char color = map[x][y];

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= N | ny >= N | nx < 0 | ny < 0) continue;
            if (visited[nx][ny]) continue;
            if (map[nx][ny] == color)
                dfs(nx, ny);
        }

    }
}
