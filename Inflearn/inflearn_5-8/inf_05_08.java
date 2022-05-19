import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class inf_05_08_Node {
    int number, value;

    inf_05_08_Node(int number, int value) {
        this.number = number;
        this.value = value;
    }
}

public class inf_05_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        System.out.print(solution(M, arr));
    }

    public static int solution(int M, int[] arr) {
        int answer = 0;
        Queue<inf_05_08_Node> queue = new LinkedList<>();

        for (int i = 0; i < arr.length; i++)
            queue.add(new inf_05_08_Node(i, arr[i]));

        while (!queue.isEmpty()) {
            inf_05_08_Node now = queue.poll();
            boolean check = false;

            for (inf_05_08_Node next : queue) {
                if (next.value > now.value) {
                    queue.add(now);
                    check = false;
                    break;
                } else check = true;
            }
            if (!check) continue;
            answer++;
            if (now.number == M) break;
        }

        return answer;
    }
}
