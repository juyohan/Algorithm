import java.util.*;

public class inf_2_4 {
	public ArrayList<Integer> solution(int count) {
		ArrayList<Integer> answer = new ArrayList<>();
		int num1 = 1;
		answer.add(num1);
		int num2 = 1;
		answer.add(num2);
		int sum = 0;

		for (int i = 2 ; i < count ; i++) {
			sum = num1 + num2;
			answer.add(sum);
			num1 = num2;
			num2 = sum;
		}

		return answer;
	}

	public static void main(String[] args) {
		inf_2_4 inf = new inf_2_4();
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		for (int result : inf.solution(num))
			System.out.print(result + " ");
	}
}
