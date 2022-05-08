import java.util.*;

public class inf_03_5 {
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
		inf_03_5 main = new inf_03_5();
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.print(main.solution(num));

	}
}
