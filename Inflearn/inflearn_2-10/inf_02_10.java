import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_02_10 {
    public static int[] dx = {1, -1, 0, 0};
    public static int[] dy = {0, 0, 1, -1};
    public static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        map = new int[N + 2][N + 2];

        for (int i = 1; i < N + 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j < N + 1; j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }

        int count = 0;

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                if (solution(i, j))
                    count++;
            }
        }

        System.out.print(count);
    }

    public static boolean solution(int x, int y) {
        if (x < 1 || y < 1 || x > map.length - 1 || y > map.length - 1)
            return false;

        for (int i = 0; i < 4; i++) {
            int cx = dx[i] + x;
            int cy = dy[i] + y;

            if (map[x][y] <= map[cx][cy])
                return false;
        }
        return true;
    }
}
