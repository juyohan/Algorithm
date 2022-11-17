import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BJ_2164 {
    static Queue<Integer> queue = new LinkedList<>();
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());

            for (int i = 1 ; i <= N ; i++) {
                queue.offer(i);
            }

            System.out.println(solution());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static int solution() {
        if (queue.size() == 1)
            return queue.poll();

        queue.poll();
        int peek = queue.poll();
        queue.offer(peek);

        return solution();
    }
}
