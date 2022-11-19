import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_1158 {
    static int[] answer;
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            solution(N,K);
            sb.append("<");
            for (int i = 0 ; i < N ; i++) {
                if (i == N - 1) {
                    sb.append(answer[i]);
                } else {
                    sb.append(answer[i] + ", ");
                }
            }
            sb.append(">");

            System.out.println(sb.toString());

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }

    public static void solution2(int N, int K) {
        LinkedList<Integer> nums = new LinkedList<>();
		for (int i = 0; i < N; i++)
			nums.add(i + 1);

		StringBuilder sb = new StringBuilder();
		sb.append('<');
		int idx = K - 1;
		for (int i = 0; i < N - 1; i++) { // N까지 가면 0으로 나눠야하니까 N-1까지
			sb.append(nums.remove(idx)).append(", ");
			idx = (idx + K - 1) % (nums.size());
		}
		sb.append(nums.remove()).append('>'); // 마지막 남은 거 넣어주기

    }

    public static void solution(int N, int K) {
        Queue<Integer> queue = new LinkedList<>();
        int count = 1, idx = 0;;
        answer = new int[N];
        
        for (int i = 1 ; i <= N ; i++) {
            queue.offer(i);
        }

        while(!queue.isEmpty()) {
            if (count == K) {
                answer[idx++] = queue.poll();
                count = 1;
                continue;
            }

            queue.offer(queue.poll());
            count++;
        }

    }
}
