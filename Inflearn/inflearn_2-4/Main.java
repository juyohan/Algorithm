import java.util.*;

public class Main {
	public int[] solution(int num) {
		int[] answer = new int[num];
		int a = 1;
		int sum = 0;

		for (int i = 0 ; i < num ; i++) {
			if (i == 0)
				answer[i] = a;
			else if (i == 1)
				answer[i] = a;

			if (i > 1) {
				sum = answer[i-2] + answer[i-1];
				answer[i] = sum;
			}
		}

		return answer;
	}

	public static void main(String[] argc) {
		Main main = new Main();
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		for (int k : main.solution(num))
			System.out.print(k + " ");
	}
}
