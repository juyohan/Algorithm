import java.util.*;

public class Main {
	public int solution(int num) {
		int answer = 0;

		for (int i = 1 ; i <= Math.ceil(num/2) ; i++) {
			int start = i;
			int sum = 0;

			while(sum <= num) {
				sum += start;
				if (sum == num) 
					answer++;
				start++;
			}
		}

		return answer;
	}

	public static void main(String[] argc) {
		Main main = new Main();
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.print(main.solution(num));

	}
}
