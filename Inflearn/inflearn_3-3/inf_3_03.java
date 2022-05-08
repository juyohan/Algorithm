import java.util.*;

public class inf_3_03 {
	public int solution(int[] arr, int k) {
		int answer = 0;
//		여긴 내가 생각해서 푼 부분
/*		for (int i = 0 ; i < arr.length - k ; i++) {
			int sum = 0;
			for (int j = i; j < i + k; j++) {
				sum += arr[j];
			}
			answer = Math.max(answer, sum);
		}
*/
//		알려준 정답
		int sum = 0;
		for (int i = 0 ; i < k ; i++ ) {
			sum += arr[i];
		}
		answer = sum;
		for (int i = k ; i < arr.length ; i++) {
			// 다음 수를 더해주고 처음 수를 빼줌
			sum += (arr[i] - arr[i - k]);
			answer = Math.max(answer, sum);
		}

		return answer;
	}

	public static void main(String[] argc) {
		inf_3_03 inf303 = new inf_3_03();
		Scanner scan = new Scanner(System.in);
		int days = scan.nextInt();
		int k = scan.nextInt();

		int[] arr = new int[days];
		for (int i = 0 ; i < days ; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.print(inf303.solution(arr, k));

	}
}
