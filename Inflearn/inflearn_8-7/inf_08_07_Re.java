import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_08_07_Re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        System.out.print(solution(n, r));
    }

    static int solution(int n, int r) {
        int answer = 0;
        int[][] map = new int[n + 1][r + 1];

        answer = DFS(n, r, map);

        return answer;
    }

    static int DFS(int n, int r, int[][] map) {
        if (map[n][r] > 0) return map[n][r];
        if (n == r || r == 0) return 1;
        else {
            return map[n][r] = DFS(n - 1, r - 1, map) + DFS(n - 1, r, map);
        }
    }
}
