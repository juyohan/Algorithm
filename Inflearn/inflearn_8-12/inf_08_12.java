import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class inf_08_12_Node {
    int x, y;

    inf_08_12_Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class inf_08_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[][] maps = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++)
                maps[i][j] = Integer.parseInt(st.nextToken());
        }

        System.out.print(solution(N, M, maps));
    }

    static int[] dx = {0, 0, 1, -1}, dy = {1, -1, 0, 0};

    public static int solution(int N, int M, int[][] maps) {
        int answer = 0;
        int[][] tomatoes = new int[N * M][2];
        int tomatoesIndex = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (maps[i][j] == 1) {
                    tomatoes[tomatoesIndex][0] = i;
                    tomatoes[tomatoesIndex][1] = j;
                    tomatoesIndex++;
                }
            }
        }

        maps = BFS(N, M, maps, tomatoes);

        for (int[] map : maps) {
            for (int target : map) {
                if (target == 0)
                    return -1;
                else
                    answer = Math.max(answer, target);
            }
        }

        return answer - 1;
    }

    public static int[][] BFS(int N, int M, int[][] maps, int[][] tomatoes) {
        Queue<inf_08_12_Node> queue = new LinkedList<>();

        for (int[] tomato : tomatoes)
            queue.add(new inf_08_12_Node(tomato[0], tomato[1]));

        while (!queue.isEmpty()) {
            inf_08_12_Node now = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + now.x;
                int ny = dy[i] + now.y;

                if (nx >= N || ny >= M || nx < 0 || ny < 0) continue;
                if (maps[nx][ny] == -1 || maps[nx][ny] > 0) continue;
                    maps[nx][ny] = maps[now.x][now.y] + 1;
                    queue.add(new inf_08_12_Node(nx, ny));
            }
        }

        return maps;
    }
}
