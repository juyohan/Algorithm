import java.util.*;

public class inf_2_5 {
	public int solution(int count){
		int answer = 1;

		for (int i = 0; i <= count ; i++) {
			for (int j = 2; j <= Math.sqrt(i) ; j++) {
				if (i % j == 0)
					break;
			}
			answer++;
		}

		return answer;
	}

	public static void main(String[] args) {
		inf_2_5 inf = new inf_2_5();
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		System.out.print(inf.solution(num));
	}
}
