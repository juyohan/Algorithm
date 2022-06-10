import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class inf_08_11_Node {
    int x, y;

    inf_08_11_Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class inf_08_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] map = new int[7][7];

        for (int i = 0; i < 7; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 7; j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }

        System.out.print(solution(map));
    }

    static int[] dx = {1, -1, 0, 0}, dy = {0, 0, 1, -1};

    public static int solution(int[][] map) {
        int answer = 0;

        answer = BFS(map);

        return answer;
    }

    public static int BFS(int[][] map) {
        Queue<inf_08_11_Node> queue = new LinkedList();
        queue.add(new inf_08_11_Node(0, 0));
        int[][] check = new int[7][7];
//        int count = Integer.MAX_VALUE, min = 0;

        while (!queue.isEmpty()) {
            inf_08_11_Node now = queue.poll();

            for (int i = 0 ; i < 4 ; i++) {
                int nx = dx[i] + now.x;
                int ny = dy[i] + now.y;

                if (nx > 6 || ny > 6 || nx < 0 || ny < 0) continue;
                if (map[nx][ny] == 1) continue;
                map[nx][ny] = 1;
                queue.add(new inf_08_11_Node(nx, ny));
                check[nx][ny] = check[now.x][now.y] + 1;
            }
            // 시간 복잡도가 O(n^2)
//            int size = queue.size();
//            for (int j = 0; j < size; j++) {
//                inf_08_11_Node now = queue.poll();
//
//                if (now.x == 6 && now.y == 6) {
//                    count = Math.min(count, min);
//                    break;
//                }
//
//                for (int i = 0; i < 4; i++) {
//                    int nx = dx[i] + now.x;
//                    int ny = dy[i] + now.y;
//
//                    if (nx > 6 || ny > 6 || nx < 0 || ny < 0) continue;
//                    if (map[nx][ny] == 1) continue;
//                    map[nx][ny] = 1;
//                    queue.add(new inf_08_11_Node(nx, ny));
//                }
//            }
//            min++;
        }

//        return count == Integer.MAX_VALUE ? -1 : count;
        return check[6][6] == 0 ? -1 : check[6][6];
    }
}
