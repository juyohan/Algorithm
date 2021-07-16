import java.util.*;

public class Main {
	public String solution(String str) {
		String answer = "";

		for (int i = 0 ; i < str.length() ; i++) {
			int a = str.indexOf(str.charAt(i));
			if (a == i) {
				answer += str.charAt(i);
			}
		}

		return answer;
	}

	public static void main(String[] argc) {
		Main main = new Main();
		Scanner scan = new Scanner(System.in);

		String str = scan.next();

		System.out.print(main.solution(str));
	}
}
