import java.util.*;

public class Main {
	public int[] solution(String str, char c) {
		int len = str.length();
		int[] answer = new int[len];
		int num = 1000;

		for (int i = len - 1 ; i >= 0 ; i--) {
			if (str.charAt(i) != c)
				num++;
			else if (str.charAt(i) == c)
				num = 0;
			answer[i] = num;
		}

		num = 1000;
		for (int i = 0 ; i < len ; i++ ) {
			if (str.charAt(i) != c)
				num++;
			else if (str.charAt(i) == c)
				num = 0;
			answer[i] = Math.min(answer[i] , num);
		}

		return answer;
	}

	public static void main(String[] argc) {
		Main main = new Main();
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		char c = scan.next().charAt(0);

		for (int k : main.solution(str, c))
			System.out.print(k + " ");
	}
}
