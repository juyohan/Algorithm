import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BJ_2583 {
    public static int M, N, K;
    public static int[][] map;
    public static boolean[][] visited;
    public static int[] mx = {-1, 1, 0, 0};
    public static int[] my = {0, 0, -1, 1};
    public static List<Integer> list = new ArrayList<>();
    public static int cnt = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        M = scan.nextInt();
        N = scan.nextInt();
        K = scan.nextInt();

        map = new int[M][N];
        for (int i = 0 ; i < K ; i++) {
            int dx = scan.nextInt();
            int dy = scan.nextInt();
            int nx = scan.nextInt();
            int ny = scan.nextInt();

            for (int y = dy ; y < ny ; y++) {
                for (int x = dx ; x < nx ; x++) {
                    map[y][x] = 1;
                }
            }
        }

        visited = new boolean[M][N];
        for (int i = 0 ; i < M ; i++) {
            for (int j = 0 ; j < N ; j++) {
                if (!visited[i][j] && map[i][j] == 0) {
                    cnt = 0;
                    dfs(i, j);
                    list.add(cnt);
                }
            }
        }

        System.out.println(list.size());
        Collections.sort(list);
        list.stream().forEach(num -> System.out.print(num + " "));
    }

    public static void dfs(int i, int j) {
        visited[i][j] = true;
        cnt++;

        for (int k = 0 ; k < 4 ; k++) {
            int kx = i + mx[k];
            int ky = j + my[k];

            if (kx >= M | ky >= N | kx < 0 | ky < 0) continue;
            if (visited[kx][ky]) continue;
            if (map[kx][ky] == 0)
                dfs(kx, ky);
        }
    }
}
