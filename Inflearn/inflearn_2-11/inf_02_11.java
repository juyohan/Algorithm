import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_02_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][5];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE, idx = 0;

        for (int y = 0; y < N; y++) {
            int count = 0;
            for (int y2 = 0; y2 < N; y2++) {
                for (int x = 0; x < 5; x++) {
                    if (map[y][x] == map[y2][x]) {
                        count++;
                        break;
                    }
                }
            }
            if (count > max) {
                max = count;
                idx = y + 1;
            }
        }
        System.out.println(idx);
    }
}
