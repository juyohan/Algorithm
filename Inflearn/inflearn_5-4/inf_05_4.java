import java.util.*;

public class inf_05_4 {
	public static Integer solution(String str) {
		Stack<Integer> stack = new Stack<>();
		int answer = 0;

		for (char c : str.toCharArray()) {
			if (c >= '0' && c <= '9')
				stack.push(c-48);
			else {
				int rt = stack.pop();
				int lt = stack.pop();
				if (c == '+')
					stack.push(lt+rt);
				else if (c == '-')
					stack.push(lt-rt);
				else if (c == '*')
					stack.push(lt*rt);
				else if (c == '/')
					stack.push(lt/rt);
			}
		}
		answer = stack.get(0);

		return answer;
	}

	public static void main(String[] argc) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();

		System.out.println(solution(str));
	}
}
