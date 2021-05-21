import java.util.*;

public class inf_2_7 {
	public Integer solution(int[] inputs, int num) {
		int answer = 0;
		int score = 0;

		for (int result : inputs) {
			if (result == 1) {
				score++;
				answer += score;
			}
			else {
				score = 0;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		inf_2_7 inf = new inf_2_7();
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] inputs = new int[num];

		for (int i = 0 ; i < num ; i++)
			inputs[i] = scan.nextInt();

		System.out.println(inf.solution(inputs, num));
	}
}
