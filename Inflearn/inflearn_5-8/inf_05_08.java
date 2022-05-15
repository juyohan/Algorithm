import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class inf_05_08_Node implements Comparable<inf_05_08_Node> {
    int number;
    int value;

    inf_05_08_Node(int number, int value) {
        this.number = number;
        this.value = value;
    }

    @Override
    public int compareTo(inf_05_08_Node o) {
        return this.value - o.value;
    }
}

public class inf_05_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] patients = new int[N];
        for (int i = 0; i < N; i++)
            patients[i] = Integer.parseInt(st.nextToken());

        System.out.print(solution(M, patients));
    }

    public static int solution(int M, int[] patients) {
        int answer = 0;
        Queue<inf_05_08_Node> queue = new LinkedList<>();

        for (int i = 0 ; i < patients.length; i++)
            queue.add(new inf_05_08_Node(i, patients[i]));

        while (!queue.isEmpty()) {
            inf_05_08_Node now = queue.poll();

            for (inf_05_08_Node next : queue) {
                if (now.value < next.value) {
                    queue.add(now);
                    break;
                }
            }

            if (!queue.contains(now)) {
                answer++;
                if (now.number == M) break;
            }
        }

        return answer;
    }
}
