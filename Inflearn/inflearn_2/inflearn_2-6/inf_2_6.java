import java.util.*;
import java.lang.*;

public class inf_2_6 {
	public ArrayList<Integer> solution(int[] count){
		ArrayList<Integer> answer = new ArrayList<>();

		for (int num : count) {
			int result = 0;
			boolean value = true;
			// 숫자 뒤집어주기
			while(num!=0) {
				result = result*10 + num%10;
				num /= 10;
			}

			// 0, 1은 소수가 아님
			if (result == 1 || result == 0)
				value = false;

			// 소수 판별 (루트 값 사용)
			for (int i = 2 ; i <= Math.sqrt(result) ; i++) {
				// 소수가 아님
				if (result % i == 0)
					value = false;
			}
			if (value == true)
				answer.add(result);
		}

		return answer;
	}

	public static void main(String[] args) {
		inf_2_6 inf = new inf_2_6();
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] index = new int[num];

		for (int i = 0 ; i < num ; i++)
			index[i] = scan.nextInt();

		for (int result : inf.solution(index))
			System.out.print(result + " ");

	}
}
