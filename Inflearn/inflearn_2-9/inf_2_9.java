import java.util.*;
import java.lang.*;

public class inf_2_9 {
	public Integer solution(int[][] inputs, int num) {
		int answer = 0;
		int sum3 = 0, sum4= 0;

		for (int i = 0 ; i < num ; i++) {
			int sum1 = 0 , sum2 = 0;
			for (int j = 0 ; j < num ; j++) {
				sum1 += inputs[i][j];
				sum2 += inputs[j][i];
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}

		for (int i = 0 ; i < num ; i++) {
			sum3 += inputs[i][i];
			sum4 += inputs[i][num - i - 1];
		}

		if (sum3 >= sum4)
			return answer >= sum3 ? answer : sum3;
		else
			return answer >= sum4 ? answer : sum4;
	}

	public static void main(String[] args) {
		inf_2_9 inf = new inf_2_9();
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[][] inputs = new int[num][num];

		for (int i = 0 ; i < num ; i++) {
			for (int j = 0 ; j < num; j++)
				inputs[i][j] = scan.nextInt();
		}

		System.out.print(inf.solution(inputs, num));
	}
}
