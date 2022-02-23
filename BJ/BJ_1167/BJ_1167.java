import java.util.*;

class BJ_1167_Node {
    int idx, cnt;

    public BJ_1167_Node(int idx, int cnt) {
        this.idx = idx;
        this.cnt = cnt;
    }
}

public class BJ_1167 {
    static List<BJ_1167_Node>[] list;
    static boolean[] isVisited;
    static int max, maxIdx;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int V = scan.nextInt();

        list = new List[V + 1];

        for (int i = 1 ; i <= V ; i++)
            list[i] = new ArrayList<>();

        for (int i = 0 ; i < V ; i++) {
            int parent = scan.nextInt();
            while(true) {
                int child = scan.nextInt();
                if (child == -1)
                    break;
                int cnt = scan.nextInt();

                list[parent].add(new BJ_1167_Node(child, cnt));
            }
        }

        isVisited = new boolean[V + 1];
//        isVisited[1] = true;
        bfs(1);
//        dfs(1, 0);

        isVisited = new boolean[V + 1];
//        isVisited[maxIdx] = true;
        bfs(maxIdx);
//        dfs(maxIdx, 0);

        System.out.println(max);
    }

    public static void dfs(int idx, int cnt) {
        if (max < cnt) {
            max = cnt;
            maxIdx = idx;
        }

        for (BJ_1167_Node node : list[idx]) {
            if (!isVisited[node.idx]) {
                isVisited[node.idx] = true;
                dfs(node.idx, cnt + node.cnt);
            }
        }
    }

    public static void bfs(int idx) {
        Queue<BJ_1167_Node> queue = new LinkedList<>();
        queue.offer(new BJ_1167_Node(idx, 0));
        isVisited[idx] = true;

        while(!queue.isEmpty()) {
            BJ_1167_Node node = queue.poll();

            for (BJ_1167_Node nodes : list[node.idx]) {
                if (!isVisited[nodes.idx]) {
                    isVisited[nodes.idx] = true;
                    int sum = nodes.cnt + node.cnt;
                    queue.offer(new BJ_1167_Node(nodes.idx, sum));

                    if (max < sum) {
                        max = sum;
                        maxIdx = nodes.idx;
                    }
                }
            }
        }
    }
}
