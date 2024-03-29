import java.util.*;

public class inf_05_2 {
	public static String solution(String str) {
		Stack<Character> stack = new Stack<>();
		int count = 0;
		String answer = "";

		for (char c : str.toCharArray()) {
			if (c == ')') {
				count = stack.search('(');
				for (int i = 0 ; i < count ; i++)
					stack.pop();
		//		while(stack.pop() != '(');
			}
			else
				stack.push(c);
		}

		for (int i = 0 ; i < stack.size() ; i++)
			answer += stack.get(i);

		return answer;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();

		System.out.print(solution(str));
	}
}
