import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class inf_07_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        System.out.print(solution(S, E));
    }

    public static int solution(int S, int E) {
        int answer = 0;

        answer = BFS(S, E);

        return answer;
    }

    public static int BFS(int S, int E) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] check = new boolean[100001];
        int[] dx = {-1, 1, 5};
        queue.add(S);
        int count = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int now = queue.poll();

                if (now == E) return count;

                for (int j = 0; j < dx.length; j++) {
                    int nx = dx[j] + now;
                    if (nx < 10001 && nx > 0 && !check[nx]) {
                        check[nx] = true;
                        queue.add(nx);
                    }
                }
            }
            count++;
        }

        return count;
    }
}
