import java.util.*;

public class inf_05_5 {
	public static Integer solution(String str) {
		int answer = 0;
		int count = 0;
		Stack<Character> stack = new Stack<>();

/*
		for (char c : str.toCharArray()) {
			if (c == '(') {
				stack.push(c);
			}
			else {
				stack.pop();
				if (c == 
				answer += stack.size();
			}
		}
*/

		for (int i = 0 ; i < str.length() ; i++) {
			if (str.charAt(i) == '(')
				stack.push('(');
			else {
				stack.pop();
				if (str.charAt(i-1) == '(')
					answer += stack.size();
				else 
					answer += 1;
			}
		}

		return answer;
	}

	public static void main(String[] argc) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();

		System.out.println(solution(str));
	}
}
