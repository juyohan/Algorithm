import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_08_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        System.out.print(solution(n, r));
    }

    static int answer = 0;

    public static int solution(int n, int r) {
        int[][] maps = new int[n + 1][r + 1];

        answer = DFS(n, r, maps);

        return answer;
    }

    static int DFS(int n, int r, int[][] maps) {
        if (maps[n][r] > 0) return maps[n][r]; // memorization
        if (n == r || r == 0) return 1;
        else return maps[n][r] =  DFS(n - 1, r - 1, maps) + DFS(n - 1, r, maps);
    }
}
