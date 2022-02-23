import java.util.*;

class BJ_1967_Node {
    int cnt, idx;

    public BJ_1967_Node(int idx, int cnt) {
        this.idx = idx;
        this.cnt = cnt;
    }
}

/**
 * 루트 노드에서 가장 먼 노드 찾고, 먼 노드를 기준으로 가장 먼 노드를 찾은 뒤, 더하면 된다.
 */
public class BJ_1967 {
    static List<BJ_1967_Node>[] lists;
    static boolean[] isVisited;
    static int max;
    static int maxIdx;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        lists = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++)
            lists[i] = new ArrayList<>();

        for (int i = 1; i < N; i++) {
            int parent = scan.nextInt();
            int child = scan.nextInt();
            int len = scan.nextInt();

            lists[parent].add(new BJ_1967_Node(child, len));
            lists[child].add(new BJ_1967_Node(parent, len));
        }

        isVisited = new boolean[N + 1];
        bfs(1);
//        isVisited[1] = true;
//        dfs(1, 0);
//
        isVisited = new boolean[N + 1];
        if (maxIdx > 0)
            bfs(maxIdx);
//        isVisited[maxIdx] = true;
//        dfs(maxIdx, 0);
//
        System.out.println(max);
    }

    public static void dfs(int idx, int cnt) {

        if (max < cnt) {
            max = cnt;
            maxIdx = idx;
        }

        for (BJ_1967_Node node : lists[idx]) {
            if (!isVisited[node.idx]) {
                isVisited[node.idx] = true;
                dfs(node.idx, node.cnt + cnt);
            }
        }
    }

    public static void bfs(int idx) {
        Queue<BJ_1967_Node> queue = new LinkedList<>();
        queue.offer(new BJ_1967_Node(idx, 0));
        isVisited[idx] = true;

        while (!queue.isEmpty()) {
            BJ_1967_Node node = queue.poll();

            for (BJ_1967_Node nodes : lists[node.idx]) {
                if (!isVisited[nodes.idx]) {
                    int sum = nodes.cnt + node.cnt;
                    queue.offer(new BJ_1967_Node(nodes.idx, sum));

                    if (max <= sum) {
                        max = sum;
                        maxIdx = nodes.idx;
                    }
                    isVisited[nodes.idx] = true;
                }
            }

        }
    }
}
