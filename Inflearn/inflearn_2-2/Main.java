import java.util.*;

public class Main {
	public int solution(int num, int[] arr) {
		int answer = 1;
		int target = arr[0];

		for (int i = 0 ; i < num - 1 ; i++) {
			if (target < arr[i+1]) {
				answer++;
				target = arr[i+1];
			}
		}

		return answer;
	}

	public static void main(String[] argc) {
		Main main = new Main();
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int[] arr = new int[num];

		for (int i = 0 ; i < num ; i++)
			arr[i] = scan.nextInt();

		System.out.print(main.solution(num, arr));
	}
}
