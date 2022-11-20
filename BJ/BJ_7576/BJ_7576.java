import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class BJ_7576_Node {
    int x, y;

    public BJ_7576_Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class BJ_7576 {
    static int M, N, DAY = 0;
    static int[][] map;
    static Queue<BJ_7576_Node> queue = new LinkedList<>();
    static int[] dx = {0, 0, 1, -1}, dy = {1, -1, 0, 0};
    
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());

            map = new int[N][M];

            st = null;
            for (int i = 0 ; i < N ; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0 ; j < M ; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
                st = null;
            }

            solution();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void solution() {
        for (int i = 0 ; i < N ; i++) {
            for (int j = 0 ; j < M ; j++) {
                if (map[i][j] == 1) {
                    queue.add(new BJ_7576_Node(i, j));
                }
            }
        }

        bfs();

        for(int[] items : map) {
            for (int item : items) {
                if (item == 0)
                    DAY = 0;
            }
        }

        System.out.println(DAY - 1);

    }

    public static void bfs() {
        while (!queue.isEmpty()) {
            BJ_7576_Node now = queue.poll();

            DAY = Math.max(map[now.x][now.y], DAY);

            for (int i = 0 ; i < 4 ; i++) {
                int nx = dx[i] + now.x;
                int ny = dy[i] + now.y;
    
                if (nx >= N || nx < 0 || ny >= M || ny < 0) continue;
                if (map[nx][ny] == 0) {
                    map[nx][ny] = map[now.x][now.y] + 1;
                    queue.add(new BJ_7576_Node(nx, ny));
                }
            }
        }
    }
}
