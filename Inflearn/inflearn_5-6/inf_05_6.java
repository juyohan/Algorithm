import java.util.*;

public class inf_05_6 {
	public static Integer solution(int num, int k) {
		int answer = 0;
		Queue<Integer> queue = new LinkedList<>();			

		for (int i = 1 ; i <= num ; i++) 
			queue.offer(i);

		while(!queue.isEmpty()) {
			for (int i = 1 ; i < k ; i++) {
				queue.offer(queue.poll());
			}
			queue.poll();
			if (queue.size() == 1)
				answer = queue.poll(); 
		}

		return answer;
	}

	public static void main(String[] argc) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int k = scan.nextInt();

		System.out.println(solution(num, k));
	}
}
