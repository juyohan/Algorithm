import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_02_09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] matrix = new int[N][N];
        int diagonal1 = 0, diagonal2 = 0, max = 0, len = N - 1;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)
                matrix[i][j] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            int col = 0, row = 0;
            diagonal1 += matrix[i][i];
            diagonal2 += matrix[i][len--];
            for (int j = 0; j < N; j++) {
                col += matrix[j][i];
                row += matrix[i][j];
            }
            max = Math.max(max, Math.max(row, col));
        }

        max = Math.max(max, Math.max(diagonal1, diagonal2));
        System.out.print(max);
    }
}
