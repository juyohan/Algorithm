import java.util.Scanner;

public class BJ_2042 {
    public static long[] arr;
    public static long[] tree;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int K = scan.nextInt();

        arr = new long[N + 1];
        tree = new long[N * 4];

        for (int i = 1 ; i <= N ; i++)
            arr[i] = scan.nextLong();

        init(1, N, 1);

        scan.nextLine(); // 엔터 제거

        for (int i = 0; i < M + K ; i++) {
            String[] array = scan.nextLine().split(" ");
            int a = Integer.parseInt(array[0]);
            int b = Integer.parseInt(array[1]);
            if (a == 1) {
                long c = Long.parseLong(array[2]);
                long diff = c - arr[b]; // 변경할 값과 현재 값의 차이
                arr[b] = c;
                update(1, N, 1, b, diff);
            } else {
                int c = Integer.parseInt(array[2]);
                System.out.println(sum(1, N, 1, b, c));
            }
        }
    }

    public static long init(int start, int end, int node) {
        if (start == end)
            return tree[node] = arr[start];

        int mid = (start + end) / 2; // 왼쪽 노드 : node * 2 -> 짝수, 오른쪽 노드 : (node * 2) + 1 -> 홀수
        return tree[node] = init(start, mid, node * 2) + init(mid + 1, end, node * 2 + 1); // 최상위 노드는 모든 노드의 값을 더한 값
    }

    /**
     * 위치 변경
     * @param start 시작 인덱스
     * @param end 끝 인덱스
     * @param node 현재 노드의 위치
     * @param index 변경할 노드의 위치
     * @param diff 변경하기 전과 변경한 뒤의 차
     */
    public static void update(int start, int end, int node, int index, long diff ) {
        if (index < start || index > end)
            return ;

        tree[node] += diff;
        if (start != end) {
            int mid = (start + end) / 2;
            update(start, mid, node*2, index, diff);
            update(mid + 1, end, (node * 2) + 1, index, diff);
        }
    }

    /**
     * 구간 더하기
     * @param start 시작 인덱스
     * @param end 끝 인덱스
     * @param node 노드 위치
     * @param left 시작 위치
     * @param right 끝 위치
     */
    public static long sum(int start, int end, int node, int left, int right) {
        if (start > right || end < left)
            return 0;

        if (left <= start && end <= right)
            return tree[node];

        int mid = (start + end) / 2;
        return sum(start, mid,node * 2, left, right) + sum(mid + 1, end, (node * 2) + 1, left, right);
    }
}
