import java.util.*;

public class BJ_11725 {
    static List<Integer> list[];
    static int parent[];
    static boolean isVisited[];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        list = new ArrayList[N + 1];
        parent = new int[N + 1];
        isVisited = new boolean[N + 1];

        for (int i = 1; i <= N; i++)
            list[i] = new ArrayList<>();

        for (int i = 1; i < N; i++) {
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            list[num1].add(num2);
            list[num2].add(num1);
        }

//        for (int i = 1; i <= N; i++)
//            if (!isVisited[i])
//                dfs(i);
        bfs();

        for (int i = 2 ; i <= N ; i++)
            System.out.println(parent[i]);
    }

//    public static void dfs(int i) {
//        if (isVisited[i])
//            return;
//
//        isVisited[i] = true;
//
//        for (int num : list[i])
//            if (!isVisited[num]) {
//                parent[num] = i;
//                dfs(num);
//            }
//    }

    public static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        isVisited[1] = true;
        while(!queue.isEmpty()) {
            int num = queue.poll();
            for (int i : list[num]) {
                if (!isVisited[i]) {
                    queue.offer(i);
                    isVisited[i] = true;
                    parent[i] = num;
                }
            }
        }
    }
}
