import java.util.*;

public class inf_05_7 {
	public static String solution(String p, String sub) {
		Queue<Character> queue = new LinkedList<>();

		for (char c : p.toCharArray())
			queue.offer(c);

		for (char c : sub.toCharArray()) {
			if (c == queue.peek())
				queue.poll();
			if (queue.isEmpty())
				return "YES";
		}

		return "NO";

	}

	public static void main(String[] argc) {
		Scanner scan = new Scanner(System.in);

		String p = scan.next();
		String sub = scan.next();

		System.out.println(solution(p, sub));
	}
}
