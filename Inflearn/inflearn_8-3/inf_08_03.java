import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_08_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] map = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            map[i][0] = Integer.parseInt(st.nextToken());
            map[i][1] = Integer.parseInt(st.nextToken());
        }

        System.out.print(solution(M, map));
    }

    static int answer = 0;

    public static int solution(int M, int[][] map) {
        DFS(0, 0, 0, map, M);
        return answer;
    }

    public static void DFS(int start, int time, int sum, int[][] map, int M) {
        if (time > M) return;
        if (map.length == start) {
            answer = Math.max(answer, sum);
        } else {
            DFS(start + 1, time + map[start][1], sum + map[start][0], map, M);
            DFS(start + 1, time, sum, map, M);
        }
    }
}
