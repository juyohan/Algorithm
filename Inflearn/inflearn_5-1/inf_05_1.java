package PACKAGE_NAME;

import java.util.*;

public class inf_05_1 {
	public static String solution(String str) {
		Stack<Character> stack = new Stack<>();

		for (char x : str.toCharArray()) {
			if ( x == '(' )
				stack.push(x);
			else {
				if (stack.isEmpty())
					return "NO";
				stack.pop();
			}
		}
		if (stack.isEmpty()) 
			return "YES";
		else
			return "NO";
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();

		System.out.print(solution(str));
	}
}
