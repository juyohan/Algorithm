import java.util.*;

public class BJ_1068 {
    static List<Integer>[] list;
    static boolean[] isVisited;
    static int root, del, result;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        list = new List[N];
        for (int i = 0; i < N; i++)
            list[i] = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int parent = scan.nextInt();

            if (parent == -1) {
                root = i;
                continue;
            }
            list[parent].add(i);
        }
        del = scan.nextInt();

        isVisited = new boolean[N];
        bfs();

        isVisited = new boolean[N];
        dfs(root);

        System.out.println(result);
    }

    public static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(root);
        isVisited[root] = true;

        while (!queue.isEmpty()) {
            int poll = queue.poll();
            for (int num : list[poll]) {
                if (!isVisited[num]) {
                    isVisited[num] = true;
                    if (num == del)
                        break;
                    queue.offer(num);
                }
            }
            list[poll].remove(Integer.valueOf(del));
            if (!list[del].isEmpty())
                list[del].clear();
        }
    }

    public static void dfs(int root) {
        if (list[root].isEmpty() && root != del)
            result++;

        for (int num : list[root]) {
            if (!isVisited[num]) {
                dfs(num);
            }
        }
    }
}
