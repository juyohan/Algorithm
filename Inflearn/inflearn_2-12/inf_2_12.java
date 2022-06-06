import java.util.*;
import java.lang.*;

public class inf_2_12 {
	public Integer solution(int[][] inputs, int counts, int award) {
		int answer = 0;
		int[] student = new int[counts];

		for (int i = 0 ; i < counts ; i++) {
			for (int j = 0; j < award; j++) {
				// 안에 있는 학생이
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		inf_2_12 inf = new inf_2_12();
		Scanner scan = new Scanner(System.in);
		int award = scan.nextInt(); // 안에 데이터 : 학생 이름
		int counts = scan.nextInt();
		int[][] inputs = new int[counts][award];

		for (int i = 0 ; i < counts ; i++) {
			for (int j = 0 ; j < award ; j++)
				inputs[i][j] = scan.nextInt();
		}

		System.out.print(inf.solution(inputs, counts, award));
	}
}
