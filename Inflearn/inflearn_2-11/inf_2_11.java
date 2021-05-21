import java.util.*;
import java.lang.*;

public class inf_2_11 {
	public Integer solution(int[][] inputs, int num) {
		int answer = 0;
		int result = 1;
		int[] value = new int[num];
		int[][] arr = new int[num][5];

		for (int i = 0 ; i < 5 ; i++) {
			for (int j = 0 ; j < num - 1; j++) {
				for (int k = j + 1 ; k < num; k++) {
					if (inputs[j][i] == inputs[k][i]) {
						arr[k][i] = 1;
						arr[j][i] = 1;
					}
				}
			}
		}

		for (int i = 0; i < num; i++) {
			int count = 0;
			for (int j = 0 ; j < 5 ; j++) {
				if (arr[i][j] == 1)
					count++;
			}
			value[i] = count;
		}

		for (int i = 0 ; i < num ; i++) {
			if (answer < value[i]) {
				answer = value[i];
				result = i + 1;
			}
		}
		

		return result;
	}

	public static void main(String[] args) {
		inf_2_11 inf = new inf_2_11();
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[][] inputs = new int[num][5];

		for (int i = 0 ; i < num ; i++) {
			for (int j = 0 ; j < 5 ; j++)
				inputs[i][j] = scan.nextInt();
		}

		System.out.print(inf.solution(inputs, num));
	}
}
