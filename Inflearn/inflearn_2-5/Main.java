import java.util.*;

public class Main {
	public Integer solution(int num) {
		int answer = 0;
		boolean[] arr = new boolean[num+1];
		arr[0] = arr[1] = true;

		// 제곱부터 지워나가기 때문에 제곱이 제공된 수보다 작거나 같아야함
		for (int i = 2 ; i*i <= num ; i++) {
			if (arr[i] == false) {
				// 각 제곱부터 시작해서 i의 배수를 지워나가는 과정
				for (int j = i*i ; j <= num ; j+=i) 
					arr[j] = true;
			}
		}

		for (int i = 0 ; i < num ; i++) {
			if (arr[i] == false)
				answer++;
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
