import java.util.*;

public class Main {
	public String solution(String p, String sub) {
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
		Main main = new Main();
		Scanner scan = new Scanner(System.in);

		String p = scan.next();
		String sub = scan.next();

		System.out.println(main.solution(p, sub));
	}
}
