import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class BJ_1753_Node implements Comparable<BJ_1753_Node> {
    int destination, destinationCost;

    BJ_1753_Node(int destination, int destinationCost) {
        this.destination = destination;
        this.destinationCost = destinationCost;
    }

    @Override
    public int compareTo(BJ_1753_Node o) {
        return this.destinationCost - o.destinationCost;
    }
}

public class BJ_1753 {
    public static int[] dist;
    public static ArrayList<ArrayList<BJ_1753_Node>> graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(br.readLine());

        graph = new ArrayList<>();
        for (int i = 0; i < V + 1; i++)
            graph.add(new ArrayList<>());

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            graph.get(start).add(new BJ_1753_Node(end, cost));
        }

        dist = new int[V + 1];

        for (int i = 0; i < V + 1; i++)
            dist[i] = Integer.MAX_VALUE;
        dist[K] = 0;

        dijkstra(K);

        for (int i = 1; i < V + 1; i++) {
            if (dist[i] == Integer.MAX_VALUE)
                sb.append("INF\n");
            else
                sb.append(dist[i] + "\n");
        }
        System.out.println(sb);
    }

    public static void dijkstra(int start) {
        PriorityQueue<BJ_1753_Node> queue = new PriorityQueue<>();
        queue.add(new BJ_1753_Node(start, 0));

        while (!queue.isEmpty()) {
            BJ_1753_Node node = queue.poll();
            if (node.destinationCost > dist[node.destination]) continue;
            int len = graph.get(node.destination).size();
            for (int i = 0; i < len; i++) {
                BJ_1753_Node node1 = graph.get(node.destination).get(i);

                if (dist[node1.destination] > node.destinationCost + node1.destinationCost) {
                    dist[node1.destination] = node.destinationCost + node1.destinationCost;
                    queue.add(new BJ_1753_Node(node1.destination, dist[node1.destination]));
                }
            }
        }
    }
}
