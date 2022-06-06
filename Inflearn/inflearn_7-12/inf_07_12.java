import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class inf_07_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < M; i++)
            graph.add(new ArrayList<>());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            graph.get(Integer.parseInt(st.nextToken())).add(Integer.parseInt(st.nextToken()));
        }

        int[] answer = solution(graph, N);
        for (int i = 2; i <= N; i++) {
            System.out.println(i + " : " + answer[i]);
        }
    }

    public static int[] solution(List<List<Integer>> graph, int N) {
        return BFS(graph, 1, N);
    }

    public static int[] BFS(List<List<Integer>> graph, int start, int N) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        boolean[] check = new boolean[N + 1];
        int[] arr = new int[N + 1];

        while (!queue.isEmpty()) {
            int value = queue.poll();

            for (int k : graph.get(value)) {
                if (!check[k]) {
                    check[k] = true;
                    arr[k] = arr[value] + 1;
                    queue.add(k);
                }
            }
        }
        return arr;
    }
}
