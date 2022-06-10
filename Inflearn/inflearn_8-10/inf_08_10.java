import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_08_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] graph = new int[7][7];

        for (int i = 0; i < 7; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 7; j++)
                graph[i][j] = Integer.parseInt(st.nextToken());
        }

        System.out.print(solution(graph));
    }

    static int[] dx = {0, 0, 1, -1}, dy = {1, -1, 0, 0};
    static int answer = 0;

    public static int solution(int[][] graph) {
        boolean[][] check = new boolean[7][7];

        DFS(0, 0, graph, check);

        return answer / 2;
    }

    public static void DFS(int x, int y, int[][] graph, boolean[][] check) {
        if (x == 6 && y == 6) {
            answer += 1;
        } else {
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + x;
                int ny = dy[i] + y;

                if (nx > 6 || ny > 6 || nx < 0 || ny < 0) continue;
                if (graph[nx][ny] == 1) continue;
                if (!check[nx][ny]) {
                    check[nx][ny] = true;
                    DFS(nx, ny, graph, check);
                    check[nx][ny] = false;
                }
            }
        }
    }
}
