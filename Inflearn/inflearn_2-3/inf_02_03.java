import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_02_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int[][] value = new int[2][N];

        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)
                value[i][j] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            if (value[0][i] == 1) {
                if (value[1][i] == 2) sb.append("B\n");
                else if (value[1][i] == 3) sb.append("A\n");
                else sb.append("D\n");
            } else if (value[0][i] == 2) {
                if (value[1][i] == 1) sb.append("A\n");
                else if (value[1][i] == 3) sb.append("B\n");
                else sb.append("D\n");
            } else {
                if (value[1][i] == 1) sb.append("B\n");
                else if (value[1][i] == 2) sb.append("A\n");
                else sb.append("D\n");
            }
        }
        System.out.print(sb);
    }
}
