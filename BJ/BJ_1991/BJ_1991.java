import java.util.Scanner;

class BJ_1991_Node {
    char data;
    BJ_1991_Node left;
    BJ_1991_Node right;

    public BJ_1991_Node(char data) {
        this.data = data;
    }
}

class BJ_1991_Tree {
    BJ_1991_Node node; // 트리 초기화

    /**
     * 루트 노드가 없다면, 루트 노드를 삽입.
     * 루트 노드가 있다면, 부모 노드를 찾는 메소드를 실행.
     *
     * @param data  부모 노드
     * @param left  왼쪽 자식 노드
     * @param right 오른쪽 자식 노드
     */
    public void initNode(char data, char left, char right) {
        if (node == null) {
            if (data != '.')
                node = new BJ_1991_Node(data);
            if (left != '.')
                node.left = new BJ_1991_Node(left);
            if (right != '.')
                node.right = new BJ_1991_Node(right);
        } else
            searchNode(node, data, left, right);
    }

    /**
     * 현재 노드가 없다면, 멈춥니다.
     * 현재 노드와 삽입할 노드가 같다면, 자식 노드들을 삽입합니다.
     * 아니라면, 자식 노드(왼쪽, 오른쪽)를 계속 순회해서 찾습니다.
     *
     * @param node  현재 노드
     * @param data  삽입할 노드
     * @param left  자식 왼쪽 노드
     * @param right 자식 오른쪽 노드
     */
    public void searchNode(BJ_1991_Node node, char data, char left, char right) {
        if (node == null)
            return;
        else if (node.data == data) {
            if (left != '.')
                node.left = new BJ_1991_Node(left);
            if (right != '.')
                node.right = new BJ_1991_Node(right);
        } else {
            searchNode(node.left, data, left, right);
            searchNode(node.right, data, left, right);
        }
    }

    // 전위 순회
    public void preOrder(BJ_1991_Node node) {
        System.out.print(node.data);

        if (node.left != null)
            preOrder(node.left);
        if (node.right != null)
            preOrder(node.right);
    }

    // 중위 순회
    public void inOrder(BJ_1991_Node node) {
        if (node.left != null)
            inOrder(node.left);

        System.out.print(node.data);

        if (node.right != null)
            inOrder(node.right);
    }

    // 후위 순회
    public void postOrder(BJ_1991_Node node) {
        if (node.left != null)
            postOrder(node.left);
        if (node.right != null)
            postOrder(node.right);

        System.out.print(node.data);
    }
}

public class BJ_1991 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        BJ_1991_Tree tree = new BJ_1991_Tree();

        for (int i = 0; i < N; i++) {
            tree.initNode(
                    scan.next().charAt(0),
                    scan.next().charAt(0),
                    scan.next().charAt(0)
            );
        }

        tree.preOrder(tree.node);
        System.out.println();
        tree.inOrder(tree.node);
        System.out.println();
        tree.postOrder(tree.node);
    }
}
