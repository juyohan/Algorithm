import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class inf_07_09_Node {
    int node;
    inf_07_09_Node left, right;

    inf_07_09_Node(int node) {
        this.node = node;
    }
}

class inf_07_09_Tree {
    inf_07_09_Node node;

    public void initialNode(int data, int left, int right) {
        if (node == null) {
            if (data != -1)
                node = new inf_07_09_Node(data);
            if (left != -1)
                node.left = new inf_07_09_Node(left);
            if (left != -1)
                node.right = new inf_07_09_Node(right);
        } else
            searchNodes(node, data, left, right);
    }

    public void searchNodes(inf_07_09_Node searchNode, int data, int left, int right) {
        if (searchNode == null) return;
        if (searchNode.node == data) {
            if (left != -1)
                searchNode.left = new inf_07_09_Node(left);
            if (right != -1)
                searchNode.right = new inf_07_09_Node(right);
        } else {
            searchNodes(searchNode.left, data, left, right);
            searchNodes(searchNode.right, data, left, right);
        }
    }
}

public class inf_07_09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] maps = new int[N][3];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            maps[i][0] = Integer.parseInt(st.nextToken());
            maps[i][1] = Integer.parseInt(st.nextToken());
            maps[i][2] = Integer.parseInt(st.nextToken());
        }

        System.out.print(solution(maps));
    }

    public static int solution(int[][] maps) {
        inf_07_09_Tree tree = new inf_07_09_Tree();

        for (int[] map : maps)
            tree.initialNode(map[0], map[1], map[2]);

//        return DFS(0, tree.node);
        return BFS(tree.node);
    }

    public static int DFS(int count, inf_07_09_Node node) {
        if (node.right == null && node.left == null) {
            return count;
        }

        return Math.min(DFS(count + 1, node.left), DFS(count + 1, node.right)); // 왼쪽과 오른쪽 중에서 작은 값
    }

    public static int BFS(inf_07_09_Node node) {
        int count = 0;
        Queue<inf_07_09_Node> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()) {
            int queueLen = queue.size();
            for (int i = 0 ; i < queueLen ; i++ ) {
                inf_07_09_Node now = queue.poll();
                if (now.left == null && now.right == null) return count;
                if (now.left != null) queue.add(now.left);
                if (now.right != null) queue.add(now.right);
            }
            count++;
        }
        return count;
    }
}
